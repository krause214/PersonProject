package com.company;

public class Student extends Person {

    private String institute;
    private Person curator;
    private YearOfStudy yearOfStudy;

    //Constructors

    public Student() {
        this.curator = new Person();
        this.yearOfStudy = YearOfStudy.NONE;
    }

    public Student(Person person, String institute, Person curator, YearOfStudy yearOfStudy) {
        super(person.getAge(), person.getHeight(), person.getWeight(), person.getName(), person.getGender());
        this.institute = institute;
        this.curator = curator;
        this.yearOfStudy = yearOfStudy;
    }

    //PersonActions Interface implementation

    @Override
    public void sayWhatICanDo() {
        System.out.println("I can learn a lot!");
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am Student." + "\nMy name is: " + this.getName() + ".\nI am " + this.getAge() + " years old.");
        this.sayWhatICanDo();
    }

    //Inner class

    public class AddStudentInf {
        private boolean isAMarkStudent;
        private KindOfSport kindOfSport;

        public AddStudentInf() {
            if (Student.this.yearOfStudy == YearOfStudy.NONE) {
                this.isAMarkStudent = false;
                this.kindOfSport = KindOfSport.NONE;
            }
        }
        public AddStudentInf(boolean isAMarkStudent, KindOfSport kindOfSport) {
            this.isAMarkStudent = isAMarkStudent;
            this.kindOfSport = kindOfSport;
        }
    }
    public enum KindOfSport {
        NONE, BASKETBALL, FOOTBALL, VOLLEYBALL, ATHLETICS
    }


    //Getters and Setters

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


    //To String

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ",institute='" + institute + '\'' +
                ", curator=" + curator.toString() +
                ", yearOfStudy=" + yearOfStudy.toString() +
                '}';
    }

}
