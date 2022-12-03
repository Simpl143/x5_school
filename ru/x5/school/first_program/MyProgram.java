package ru.x5.school.first_program;

import ru.x5.school.first_program.entities.Employee;
import ru.x5.school.first_program.entities.People;
import ru.x5.school.first_program.repositories.Storage;
import ru.x5.school.first_program.repositories.impl.LocalStorage;


public class MyProgram {
    public static void main(String[] args) {

        final Storage storage = new LocalStorage();

        Employee Den = new Employee("Den", "Ivanov", 34, 546543, "X5 Group", 34556, 35);
        Employee Alex = new Employee("Alex", "Petrov", 42, 675412, "HH", 657843, 567);

    }

}
