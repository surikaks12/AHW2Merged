package com.company.repository;

import com.company.domain.Employee;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImplementation implements EmployeeRepository {

//    private Map<Integer, Employee> map = new HashMap<>();
//    @PostConstruct
//    public void init() {
//        Employee employee1 = new Employee(1,"Alice");
//        Employee employee2 = new Employee(2, "Bob");
//        map.put(employee1.getId(), employee1);
//        map.put(employee2.getId(), employee2);
//    }
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeMap.values().stream().collect(Collectors.toList());
    }
}