package com.company.repository;

import com.company.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository  {
    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();


}