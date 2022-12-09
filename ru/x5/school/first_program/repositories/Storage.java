package ru.x5.school.first_program.repositories;

import ru.x5.school.first_program.entities.Employee;

import java.util.List;
import java.util.Set;

public interface Storage {

    Employee save(Employee target);

    void saveAll(List<Employee> target);

    Employee getByld(String id);

    List<Employee> getBylds(List<String> ids);
}