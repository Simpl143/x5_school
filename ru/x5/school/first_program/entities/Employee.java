package ru.x5.school.first_program.entities;

public class Employee extends People {

        private final int id;
        private final String company;
        private final int salary;
        private final int hoursWorked;

    public Employee(String firstName, String lastName, int age, int id, String company, int salary, int hoursWorked){

        super(firstName, lastName, age);
        this.id = id;
        this.company = company;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(company);
        System.out.println("Salary = " + (salary * hoursWorked));
    }
}
