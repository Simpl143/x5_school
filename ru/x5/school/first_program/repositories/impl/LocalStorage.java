package ru.x5.school.first_program.repositories.impl;

import ru.x5.school.first_program.entities.Employee;
import ru.x5.school.first_program.repositories.Storage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalStorage implements Storage {

    private final Map<String, Employee> storage = new HashMap<>();


    @Override
    public String save(Employee target) {
        return null;
    }

    @Override
    public List<String> saveAll(List<Employee> target) {
        return null;
    }

    @Override
    public Employee getByld(String id) {
        return null;
    }

    @Override
    public List<Employee> getBylds(List<String> ids) {
        return null;
    }
}
