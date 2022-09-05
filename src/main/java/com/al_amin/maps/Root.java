package com.al_amin.maps;

import java.util.*;

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Root {
    public static void main(String[] args) {
        Hashtable<Integer, List<Person>> map = new Hashtable<>();
        List<Person> people = new ArrayList<>(List.of(
                new Person(1, "Al Amin"),
                new Person(1, "Rony"),
                new Person(3, "Al Amin"),
                new Person(3, "Akash"),
                new Person(4, "Al Amin")
        ));
        for (Person per: people){
            if (map.containsKey(per.getId())){
                List<Person> pr = map.get(per.getId());
                boolean flag = false;
                for (Person p: pr){
                    if (p.getName().equals(per.getName())) {
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    List<Person> valu = new ArrayList<>(map.get(per.getId()));
                    valu.add(per);
                    map.replace(per.getId(), valu);
                }

            }else {
                map.put(per.getId(), List.of(per));
            }
        }
        System.out.println("================");
        for(Map.Entry<Integer, List<Person>> value:map.entrySet()){
            System.out.println(value.getValue());
        }

    }
}
