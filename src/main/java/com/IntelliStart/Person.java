package com.IntelliStart;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparator {
    public static final int MAX_AGE = 100;
    public static final int MAX_WEIGHT = 150;
    public static final int MAX_HEIGHT = 200;
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
    public boolean equalsWeightButNoHeight(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getHeight() != person.getHeight() && getWeight() == person.getWeight();
    }

//setters, getters, toString
}
