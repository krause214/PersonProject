package com.company;

public class Main {

    public static void main(String[] args) {

        Student nStudent = new Student(new Person(18, 175, 85, "SomeName", Gender.MALE),
                "udgu",
                new Person("Sasha", 23, Gender.FEMALE),
                YearOfStudy.FIRST
                );
        System.out.println(nStudent.toString());

        nStudent.sayWhoAmI();

    }
}

