package ru.x5.school.first_program.repositories;

import ru.x5.school.first_program.entities.Employee;

import java.util.List;

public interface Storage {

    String save(Employee target);

    List<String> saveAll(List<Employee> target);

    Employee getByld(String id);

    List<Employee> getBylds(List<String> ids);
}