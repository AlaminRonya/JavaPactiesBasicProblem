package com.al_amin.hash_table;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class Person{
    private int id;
    private String name;
    private int qty;

    public Person(int id, String name, int qty) {
        this.id = id;
        this.name = name;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                '}';
    }
}
public class Root {
    public static void main(String[] args) {
        Hashtable<String, List<Person>> listHashtable = new Hashtable<>();
        listHashtable.put("100", List.of(
                new Person(1, "Al Amin", 4),
                new Person(1, "Al Amin", 4)
                ));
        listHashtable.put("123", List.of(new Person(1, "Al Amin", 4)));
        listHashtable.put("321", List.of(new Person(2, "Jahangir", 4)));
        listHashtable.put("555", List.of(new Person(3, "Pritha", 4)));
        listHashtable.put("777", List.of(new Person(4, "Saima", 4)));

        for (String k: listHashtable.keySet()){
            System.out.println(k.hashCode()%10+"\t"+k+"\t"+listHashtable.get(k));

//            System.out.println(listHashtable.get(k));

        }
        List<Person> people = new ArrayList<>();
        people.addAll(listHashtable.get("100"));
        people.remove(0);
        int n = 2;

        System.out.println(listHashtable.get("100"));
        System.out.println("123".hashCode());
        System.out.println("321".hashCode());
    }
}
