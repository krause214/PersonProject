package com.company;

public class Worker extends Person {
    private int salary;
    private int amountOfUsefulAction = 0;

    public Worker() {
    }

    public Worker(Person person, int salary){
        super(person.getAge(), person.getHeight(), person.getWeight(), person.getName(), person.getGender());
        setSalary(salary);
    }

    public void doWork(){
        amountOfUsefulAction++;
    }

    public int getAmountOfUsefulAction() {
        return amountOfUsefulAction;
    }
    public void setAmountOfUsefulAction(int amountOfUsefulAction) {
        this.amountOfUsefulAction = amountOfUsefulAction;
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
    public static void doStatic(){
        System.out.println("doStatic" + "\n" + "call doNonStatic");
        //doNonStatic();
    }
    public void doNonStatic (){
        System.out.println("doStatic" + "\n" + "call doNonStatic");
        doStatic();
    }
}
