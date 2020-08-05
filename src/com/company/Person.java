package com.company;

import java.io.Serializable;

public class Person implements PersonActions,Serializable, Cloneable {

    static {
        String specie = "Homo";
    }

    private String name;
    private int age;
    private int height;
    private int weight;
    private Gender gender;

    public Person(){
        this.name = "NoName";
        this.age = 0;
        this.height = 0;
        this. weight = 0;
        this.gender = Gender.NOT_DEFINED;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        this.weight = 0;
        this.age = 0;
        this.height = 0;
    }

    public Person(int age, int height, int weight, String name, Gender gender){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void sayWhatICanDo() {
        System.out.println("I can live)");
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am Person." + "\nMy name is: " + this.name + ".\nI am " + this.age + " years old.");
        this.sayWhatICanDo();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age == person.age &&
        height == person.height &&
        weight == person.weight &&
        name.equals(name)) return true;
        else return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void printClass(){
        System.out.println("Person");
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
