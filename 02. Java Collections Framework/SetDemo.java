// package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("Romeo");
        names.add("Diana");
        names.add("Tom");
        names.add("Harry");
        names.add("Tom");// will not be added, duplicates not allowed
       
        if (names.contains("Diana"))
            System.out.println("Diana in the list");//expect this
        else
            System.out.println("Diana not in the list");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            // Do something with name
            System.out.println(name);
        }
        if (names.contains("Tom2"))
        System.out.println("Tom2 in the list");//expect this
    else
        System.out.println("Tom2 not in the list");

    }
}