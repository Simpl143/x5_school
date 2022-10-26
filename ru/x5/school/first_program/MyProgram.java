package ru.x5.school.first_program;

public class MyProgram {
    public static void main(String[] args) {

        People Pavel = new People("Pavel", "Moiseev", 28);

        People Ivan = new Employee("Ivan", "Ivanov", 32, "x5", 154, 162);

        Pavel.displayInfo();
        Ivan.displayInfo();

    }

}
