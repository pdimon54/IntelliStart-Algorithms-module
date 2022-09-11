package com.IntelliStart;

import java.util.Comparator;

public class Person implements Comparator {
    private int height;
    private int weight;
    private int age;
    public Person(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

//setters, getters, toString
}
