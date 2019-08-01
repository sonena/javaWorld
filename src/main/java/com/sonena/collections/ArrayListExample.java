package com.sonena.collections;

import java.util.*;

public class ArrayListExample {

    public void addElementsToList(List<String> stringList) {
        List<String> newList = new ArrayList<>(stringList);
        newList.add("Tony");
        newList.add("Kitty");
        newList.add("Dolly");
        System.out.println("list elements = " + newList);
    }

    public int getSize(List<String> list) {
        int size = list.size();
        System.out.println("size of the list == " + size);
        return size;
    }

    public List<String> getSubList(List<String> sList) {
        List<String> result = new ArrayList<String>();
        result = sList.subList(2, 5);
        System.out.println("subList = " + result);
        return result;
    }

    public List<String> getFinalList(List<String> sList) {
        List<String> result = new ArrayList<String>();
        sList.remove(5);
        System.out.println("subList = " + sList);
        return result;
    }

    public void getPredicate(List<String> nList) {
        nList.removeIf((x) -> x.equalsIgnoreCase("John"));
        System.out.println(" newList = " + nList);
    }

    public void getNextElement(List<String> hList) {
        ListIterator<String> iterator = hList.listIterator(2);
        System.out.println("Elements in the List =" + hList);
        System.out.println("iterator = " + iterator.next());

        Iterator<String> iterator1 = hList.iterator();

        while (iterator1.hasNext()) {
            String element = iterator1.next();
            if (element.equalsIgnoreCase("Jennifer")) {
                iterator1.remove();
                System.out.println("After removing Jennifer " + hList);

            }
        }
        Collections.sort(hList);
        System.out.println("Sorted List " + hList);
    }

}