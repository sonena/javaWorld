package com.sonena.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExampleTest {
    Set<String> newSet = new HashSet<String>();

    @Before
    public void testAddElementsToSet() {
        newSet.add("Library");
        newSet.add("Lab");
        newSet.add("College");
        newSet.add("Playground");
        System.out.println("Elements in Set  = " + newSet);
    }

    @Test
    public void testSortedSetElements() {
        Set<String> newTreeSet = new TreeSet<String>(newSet);
        System.out.println("Sorted tree Set = " + newTreeSet);
    }

    @Test
    public void testForDuplicateEntries() {
        newSet.add("Library");
        newSet.add("Park");
        System.out.println("check for duplicate entries = " + newSet);
    }

    @Test
    public void testForUnionInSet() {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(new Integer[]{4, 8, 2, 0, 1, 9, 6, 5, 3, 7}));
        Set<Integer> set2 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union of two sets  = " + union);
    }

    @Test
    public void testForIntersectionInSet() {
        Set<Integer> set12 = new HashSet<Integer>();
        set12.addAll(Arrays.asList(new Integer[]{1, 8, 2, 0, 1, 9, 6, 5, 3, 7}));
        Set<Integer> set13 = new HashSet<Integer>();
        set13.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> intersection = new HashSet<Integer>(set12);
        intersection.retainAll(set13);
        System.out.println("Intersection of two sets  = " + intersection);
    }

    @Test
    public void testForDifferenceInSet() {
        Set<Integer> set14 = new HashSet<Integer>();
        set14.addAll(Arrays.asList(new Integer[]{1, 8, 2, 0, 1, 9, 6, 5, 3, 7}));
        Set<Integer> set15 = new HashSet<Integer>();
        set15.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> difference = new HashSet<Integer>(set14);
        difference.removeAll(set15);
        System.out.println("Difference of two sets  = " + difference);
    }
}