package ru.x5.school.first_program.repositories.impl;

import ru.x5.school.first_program.entities.Employee;
import ru.x5.school.first_program.repositories.Storage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LocalStorage implements Storage {

    private final Map<String, Employee> storage = new HashMap<>();


    @Override
    public Employee save(Employee target) {
        return storage.put(target.getId(), target);
    }

    @Override
    public void saveAll(List<Employee> target) {
        target.forEach(this::save);
    }

    @Override
    public Employee getByld(String id) {
        return storage.get(id);
    }

    @Override
    public List<Employee> getBylds(List<String> ids) {
        return null;
    }
}
