package com.company.service;

import com.company.domain.EmployeeDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EmployeeService {

    EmployeeDTO getEmployeeById(int id);

    List<EmployeeDTO> getAllEmployees();
}