package com.company;

public class Student extends Person {

    private String institute;
    private Person curator;
    private YearOfStudy yearOfStudy;

    public Student() {
        this.curator = new Person();
        this.yearOfStudy = YearOfStudy.NOT_DEFINED;
    }

    public Student(Person person, String institute, Person curator, YearOfStudy yearOfStudy) {
        this.setAge(person.getAge());
        this.setHeight(person.getHeight());
        this.setName(person.getName());
        this.setWeight(person.getWeight());
        this.institute = institute;
        this.curator = curator;
        this.yearOfStudy = yearOfStudy;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public Person getCurator() {
        return curator;
    }

    public void setCurator(Person curator) {
        this.curator = curator;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ",institute='" + institute + '\'' +
                ", curator=" + curator.toString() +
                ", yearOfStudy=" + yearOfStudy.toString() +
                '}';
    }
}
