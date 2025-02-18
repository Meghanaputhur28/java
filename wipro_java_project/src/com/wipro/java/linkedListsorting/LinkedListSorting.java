package com.wipro.java.linkedListsorting;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
    }
}

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting:");
        for (Person p : people) {
            System.out.println(p);
        }

        Collections.sort(people, new AgeComparator());

        System.out.println("\nAfter sorting by age:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
