package ru.x5.school.first_program;

import ru.x5.school.first_program.entities.Employee;
import ru.x5.school.first_program.entities.People;
import ru.x5.school.first_program.repositories.Storage;
import ru.x5.school.first_program.repositories.impl.LocalStorage;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Set;


public class MyProgram {
    public static void main(String[] args) {

        final Storage storage = new LocalStorage();

        Employee Den = new Employee("Den", "Ivanov", 34, "546543", "X5 Group", 34556, 35);
        Employee Alex = new Employee("Alex", "Petrov", 42, "675412", "HH", 657843, 567);
        Employee Olga = new Employee("Olga", "Alexeeva", 41, "768965", "TC5", 34567, 154);



        storage.save(Den);
        storage.save(Alex);
        storage.save(Olga);

        System.out.println(storage.getByld("546543"));
        System.out.println(storage.getByld("675412"));
        System.out.println(storage.getByld("768965"));
        System.out.println(storage.getByld("5453534"));


        ArrayList<Employee> test = new ArrayList<>();
        test.add(Den);
        test.add(Alex);
        test.add(Olga);

        storage.saveAll(test);

        System.out.println(storage.getByld("546543"));
        System.out.println(storage.getByld("675412"));
        System.out.println(storage.getByld("768965"));
        System.out.println(storage.getByld("5453534"));
    }

}
