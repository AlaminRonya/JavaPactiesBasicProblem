package com.al_amin.generic;

public class Person {
    private String name;
    private String roll;

    public Person(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
