package com.sonena.collections;


import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class MapExampleTest {

    private Map newMap;

    @Before
    public void initMap() {
        newMap = new HashMap();
        newMap.put(1, "Roja");
        newMap.put(2, "Siri");
        newMap.put(3, "Kitty");
    }

    @Test
    public void testPrintElementsInMap() {
        Set setMap = newMap.entrySet();
        Iterator iterator = setMap.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) (iterator.next());
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
        System.out.println("size of the map = " + setMap.size());
    }

    @Test
    public void testInsertNewElement() {
        newMap.putIfAbsent(4, "Jennifer");
        System.out.println("New element inserted  = " + newMap);
    }

    @Test
    public void testContainsKeyMethod() {
        boolean key = newMap.containsKey(3);
        boolean value = newMap.containsValue("Roja");
        System.out.println("Key = " + key + " " + "Value = " + value);
    }

    @Test
    public void testSetKeyValues() {
        Set setKey = newMap.keySet();
        System.out.println("SetKey = " + setKey);
        Set setEntry = newMap.entrySet();
        System.out.println("Map key and values = " + setEntry);
    }

    @Before
    public void testInsertNewMap() {
        Map mapNew = new HashMap();
        mapNew.put(4, "Penny");
        mapNew.put(5, "John");
        mapNew.put(6, "Jenny");
        mapNew.put(7, "Kirti");

        newMap.putAll(mapNew);

        System.out.println("Inserted Map = " + newMap);
    }

    @Test
    public void testRemoveElementsInMap() {
        Set setMap = newMap.entrySet();
        Iterator iterator = setMap.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) (iterator.next());
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
            if (mapEntry.getKey().equals(6)) {
                System.out.println("mapEntry.getKey() == " + mapEntry.getKey());
                iterator.remove();
            }
        }
        System.out.println("New Map after removing element = " + setMap);
    }
}