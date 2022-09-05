package com.al_amin.generic;

import java.util.ArrayList;
import java.util.List;

public class Root {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.indexOf(40));
        list.print();
        list.removedAt(4);
//        list.removedAt(2);
        list.print();


        var list1 = new GenericList<String>();
        list1.add("10");
        list1.add("20");
        list1.add("30");
        list1.add("Alamin");
        System.out.println(list1.indexOf("Alamin"));

        list1.print();

        var persons = new GenericList<Person>();
        persons.add(new Person("Alamin", "123"));
        persons.add(new Person("Rony", "456"));
        persons.add(new Person("Saima", "789"));
        persons.print();
        System.out.println(persons.indexOf(new Person("Alamin", "123")));
        List<Integer> a = new ArrayList<>();
    }
}
