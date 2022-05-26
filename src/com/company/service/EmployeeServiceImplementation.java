package com.company.service;

import com.company.domain.EmployeeDTO;
import com.company.domain.Employee;
import com.company.repository.EmployeeRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    private final Log logger = LogFactory.getLog(EmployeeServiceImpl.class);
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDTO getEmployeeById(int id) {
        logger.info("Attempting to get employee by ID: " + id);
        Employee employee = employeeRepository.getEmployeeById(id);
        if (employee == null) {
            logger.error("Employee null");
            throw new RuntimeException((id + " : employee is null"));
        }
        return new EmployeeDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository
                .getAllEmployees()
                .stream()
                .map(x -> new EmployeeDTO(x))
                .collect(Collectors.toList());
    }
}