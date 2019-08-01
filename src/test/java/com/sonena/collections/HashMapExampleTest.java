package com.sonena.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class HashMapExampleTest {

    private HashMap<Integer, String> newMap;

    @Before
    public void testAddElementsToHashMap() {
        newMap = new HashMap<>();
        newMap.put(1, "Earth");
        newMap.put(2, "Moon");
        newMap.put(3, "Sun");
        System.out.println("Elements in HashMap = " + newMap);
    }

    @Test
    public void testHashCode() {
        System.out.println("hasCode = " + newMap.hashCode());
        System.out.println("values = " + newMap.values());
    }

    @Test
    public void testCheckHasCode() {
        HashMapExampleTest mapObj = new HashMapExampleTest();
        HashMapExampleTest mapObj1 = new HashMapExampleTest();
        System.out.println("hashcode of objects = " + mapObj.hashCode() + "," + mapObj1.hashCode());
        if (mapObj.hashCode() == mapObj1.hashCode()) {
            System.out.println("hashCode is equal");
        } else
            System.out.println("hashCode is not equal");
        if (mapObj.equals(mapObj1)) {
            System.out.println("Objects are equal");
        } else
            System.out.println("objects are not equal");
    }


    @Test
    public void testCheckHashCodeObj() {
        HashMapExampleTest mapObj = new HashMapExampleTest();
        HashMapExampleTest mapObj3 = new HashMapExampleTest();
        mapObj3 = mapObj;
        System.out.println("hashcode of objects = " + mapObj3.hashCode());
        if (mapObj.hashCode() == mapObj3.hashCode()) {
            System.out.println("hashCode is equal");
        } else
            System.out.println("hashCode is not equal");

        if (mapObj3.equals(mapObj)) {
            System.out.println("Objects are equal");
        }
    }
}