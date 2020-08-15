package com.company;

public interface PersonActions {
    static void printName(Person person){
         System.out.println(person.getName());
    }
    void sayWhatICanDo();
    default void sayWhoAmI(){
        System.out.println(this.toString());
    };
}
