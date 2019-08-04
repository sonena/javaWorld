package com.sonena.collections;

import com.sonena.BadEmployee;
import com.sonena.Department;
import com.sonena.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
    public void testCheckHashCode() {
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

    @Test
    public void testCheckHashCodeObj1() {
        Map<Employee, String> employeeMap = new HashMap<>();
        Employee e1 = new Employee(100, Department.ACCOUNTING, 2000);
        Employee e2 = new Employee(101, Department.ACCOUNTING, 5000);
        Employee e5 = new Employee(101, Department.ACCOUNTING, 6000);

        employeeMap.put(e1, "Entry 1");
        employeeMap.put(e2, "Entry 2");
        employeeMap.put(e5, "Entry 5");

        System.out.println(employeeMap.size());

        Map<Employee, String> employeeMap2 = new HashMap<>();
        Employee e3 = new BadEmployee(100, Department.ACCOUNTING, 2000);
        Employee e4 = new BadEmployee(101, Department.ACCOUNTING, 5000);

        employeeMap2.put(e3, "Entry 3");
        employeeMap2.put(e4, "Entry 4");
        System.out.println(employeeMap2.size());
    }
}