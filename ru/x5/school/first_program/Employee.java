package ru.x5.school.first_program;

class Employee extends People {

        private final String company;
        private final int salary;
        private final int hoursWorked;

    public Employee(String firstName, String lastName, int age, String company, int salary, int hoursWorked){

        super(firstName, lastName, age);
        this.company = company;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(company);
        System.out.print("Salary = " + (salary * hoursWorked));
    }
}
