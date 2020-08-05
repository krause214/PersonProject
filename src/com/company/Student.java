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
        super(person.getAge(), person.getHeight(), person.getWeight(), person.getName(), person.getGender());
        this.institute = institute;
        this.curator = curator;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public void sayWhatICanDo() {
        System.out.println("I can learn a lot!");
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am Student." + "\nMy name is: " + this.getName() + ".\nI am " + this.getAge() + " years old.");
        this.sayWhatICanDo();
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
