package com.sonena.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleTest {

    private List<String> newList;

    @Before
    public void initList() {
        newList = new ArrayList<String>();
        newList.add("Roja");
        newList.add("Siri");
        newList.add("Kitty");
        newList.add("John");
        newList.add("JEnny");
        newList.add("JEnnifer");

    }

    @Test
    public void testArrayListInitialization() {
        ArrayListExample listObj = new ArrayListExample();
        listObj.addElementsToList(newList);
    }

    @Test
    public void testGetSizeOfTheList() {
        ArrayListExample listObj = new ArrayListExample();
        int size = listObj.getSize(newList);
    }

    @Test
    public void testGetSubList() {
        ArrayListExample listObj = new ArrayListExample();
        List<String> result = new ArrayList<String>();
        result = listObj.getSubList(newList);
    }

    @Test
    public void testGetFinalList() {
        ArrayListExample listObj = new ArrayListExample();
        List<String> result = new ArrayList<String>();
        result = listObj.getFinalList(newList);
    }

    @Test
    public void testGetPredicatedList() {
        ArrayListExample listObj = new ArrayListExample();
        listObj.getPredicate(newList);
    }

    @Test
    public void testGetNextElement() {
        ArrayListExample listObj = new ArrayListExample();
        listObj.getNextElement(newList);
    }
}