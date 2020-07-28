package com.company;

public class Worker extends Person {
    private int salary;

    public Worker() {
    }

    public Worker(Person person, int salary){
        this.setAge(person.getAge());
        this.setHeight(person.getHeight());
        this.setName(person.getName());
        this.setWeight(person.getWeight());
        setSalary(salary);
    }

    public void printClass(){
        System.out.println("Worker");
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public void gender(String gender, String someAddition){
        System.out.println(gender + ' ' + someAddition + " its gender of worker + some Addition");
    }

    public static void doStatic(){
        System.out.println("doStatic" + "\n" + "call doNonStatic");
        //doNonStatic();
    }
    public void doNonStatic (){
        System.out.println("doStatic" + "\n" + "call doNonStatic");
        doStatic();
    }
}
