package com.franktran;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student frank = new Student(123, "Frank");
        Student oliver = new Student(456, "Oliver");
        Student henry = new Student(123, "Frank");

        students.add(frank);
        students.add(oliver);
        students.add(henry);

//        System.out.println("frank == henry: " + (frank == henry));
//        System.out.println("frank.equals(henry): " + frank.equals(henry));

//        System.out.println(frank.hashCode());
//        System.out.println(henry.hashCode());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
