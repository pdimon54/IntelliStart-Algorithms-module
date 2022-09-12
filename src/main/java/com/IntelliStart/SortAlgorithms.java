package com.IntelliStart;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SortAlgorithms {
    public static void main(String[] args) {
        Person[] people = new Person[100000];
        for (int i = 0;i<people.length;i++){
            people[i] = new Person(ThreadLocalRandom.current().nextInt(0, Person.MAX_HEIGHT),
                    ThreadLocalRandom.current().nextInt(0, Person.MAX_WEIGHT),
                    ThreadLocalRandom.current().nextInt(0, Person.MAX_AGE));
        }
        /*people[0] = new Person(100,100,10);
        people[1] = new Person(100,100,10);
        people[2] = new Person(200,10,10);
        people[3] = new Person(100,100,10);
        people[4] = new Person(150,10,10);
        people[5] = new Person(100,10,10);
        people[6] = new Person(100,10,11);
        people[7] = new Person(100,10,12);
        people[8] = new Person(100,10,13);
        people[9] = new Person(100,10,14);*/
        Comparator<Person> comparatorAgePerson = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {

                    return o1.getAge() - o2.getAge();
            }
        };

        Comparator<Person> comparatorWeightPerson = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {

                return o1.getWeight() - o2.getWeight();
            }
        };

        Comparator<Person> comparatorHeightPerson = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {

                return o1.getHeight() - o2.getHeight();
            }
        };


        for (Person person:people) {
            System.out.println(person);
        }
        System.out.println("==========================================");
        System.out.println("First task:");
        Arrays.sort(people,comparatorAgePerson);//sort for age with age comparator
        for (Person person:people) {
            System.out.println(person);
        }

        System.out.println("==========================================");

        System.out.println("Second task:");
        Arrays.sort(people,comparatorWeightPerson);//sort for weight with weight comparator
        for (Person person:people) {
            System.out.println(person);
        }
        System.out.println("==========================================");
        Arrays.sort(people,comparatorHeightPerson);//sort for height with height comparator
        for (Person person:people) {
            System.out.println(person);
        }

        System.out.println("==========================================");
        System.out.println("Third task:");

        Arrays.sort(people,comparatorWeightPerson);
        for (Person person:people) {
            System.out.println(person);
        }
        System.out.println(uniqueHighPeople(people));// Difficult are O(n^2)

        System.out.println("Додаткове завдання 1:");
        System.out.println("Можлива складність O(n)(лінійна), якщо до нас приходить вже відсортований масив");

    }

    private static int uniqueHighPeople(Person[] people){
        int result = 0;
        int repeatValue = 1;
        int[] uniqueHighPeople = new int[people.length];

        for (int i = 0;i<people.length-1;i++){
            if(i == 0){
                for (int j = 1;j<people.length;j++){
                    if(people[i].getWeight()==people[j].getWeight()&&people[i].getHeight()!=people[j].getHeight()){
                        repeatValue++;
                    }
                }
                uniqueHighPeople[i]+=repeatValue;
                repeatValue = 1;
            }
            else if(people[i-1].getWeight()!=people[i].getWeight()) {
                for (int j = 1; j < people.length; j++) {
                    if (people[i].getWeight() == people[j].getWeight() && people[i].getHeight() != people[j].getHeight()) {
                        repeatValue++;
                    }
                }
                uniqueHighPeople[i] += repeatValue;
                repeatValue = 1;
            }
        }


        for (int i = 0; i<uniqueHighPeople.length;i++){
            if (uniqueHighPeople[i]!=1) {
                //System.out.println(uniqueHighPeople[i]);
                result += uniqueHighPeople[i];
            }
        }

        return result;
    }
}
