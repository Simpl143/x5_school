package ru.x5.school.first_program;

public class People {

    private final String firstName;
    private final String lastName;
    private final int age;

    public People(String firstName, String lastName, int age){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void displayInfo(){
        System.out.println(firstName + " " + lastName + " " + age);
    }
}
