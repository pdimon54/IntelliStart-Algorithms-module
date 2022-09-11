package com.IntelliStart;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortAlgorithms {
    public static void main(String[] args) {
        Person[] people = new Person[100000];
        for (int i = 0;i<people.length;i++){
            people[i] = new Person(ThreadLocalRandom.current().nextInt(0, 200),
                    ThreadLocalRandom.current().nextInt(0, 150),
                    ThreadLocalRandom.current().nextInt(0, 100));
        }
        /*Comparator<Person> comparatorAge = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int res = o1.getAge().compareTo(o2.getDescription());
                if (res == 0)
                    return o1.getPriority() < o2.getPriority() ? -1 : 1;
                else
                    return res;
            }
        };*/
        System.out.println("First task:");
        Arrays.sort(people);

    }
}
