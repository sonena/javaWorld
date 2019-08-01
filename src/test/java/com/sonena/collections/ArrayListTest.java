package com.sonena.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListTest {

    private List<String> newList;

    @Before
    public void initList() {
        newList = new ArrayList<String>();
        newList.add("Roja");
        newList.add("Siri");
        newList.add("Kitty");
    }

    @Test
    public void testListInitialization() {
        Assert.assertEquals(2, newList.size());
    }

    @Test
    public void testListIteration() {
        newList.stream().forEach(System.out::println);
    }

    @Test
    public void testListIteration1() {
        newList.stream().forEach(x -> System.out.println(x));
    }

    @Test
    public void testListIteration2() {
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("iteration2 " + newList.get(i));
        }
    }

    @Test
    public void testListIteration3() {
        for (String element : newList) {
            System.out.println("iteration3 " + element);
        }
    }

    @Test
    public void testListIteration4() {
        Iterator<String> iterator = newList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("iterator4 " + element);
        }
    }

    @Test
    public void testElementRemoval() {
        Iterator<String> iterator = newList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equalsIgnoreCase("Kitty")) {
                iterator.remove();
            }
        }
        System.out.println("list size " + newList.size());
    }

    private Predicate<String> kittyPredicate = (x) -> x.equalsIgnoreCase("Kitty");
    private Predicate<String> siriPredicate = (x) -> x.equalsIgnoreCase("Siri");

    @Test
    public void testElementRemoval2() {
        newList.removeIf(kittyPredicate);
        System.out.println("list size " + newList.size());
    }

    @Test
    public void testElementRemoval3() {
        newList.removeIf(kittyPredicate.or(siriPredicate));
        System.out.println("list size " + newList.size());
    }

    @Test
    public void testElementRemoval4() {
        newList.removeIf(kittyPredicate.negate());
        System.out.println("list " + newList);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testElementIncorrectRemoval() {
        expectedException.expect(ConcurrentModificationException.class);
        for (String element : newList) {
            System.out.println("testElementIncorrectRemoval " + element);
            newList.remove(element);
        }
        System.out.println("list size " + newList);
    }

    @Test
    public void testListContains() {
        Assert.assertEquals(true, newList.contains("Kitty"));
    }

    @Test
    public void testListIsEmpty() {
        Assert.assertEquals(false, newList.isEmpty());
    }
}