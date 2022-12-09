package ru.x5.school.first_program.entities;

import ru.x5.school.first_program.repositories.Storage;

public class Employee extends People {

    private final String id;
    private final String company;
    private final int salary;
    private final int hoursWorked;

    public Employee(String firstName, String lastName, int age, String id, String company, int salary, int hoursWorked) {

        super(firstName, lastName, age);
        this.id = id;
        this.company = company;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public String getId() {
        return id;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(company);
        System.out.println("Salary = " + (salary * hoursWorked));
    }

}
