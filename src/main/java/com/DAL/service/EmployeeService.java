package com.DAL.service;

import com.DAL.entity.Employee;
import com.DAL.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> GetEmployee(){
        return (List<Employee>) employeeRepo.findAll();

    }

    public void insertEmployee(Employee employee) {
       employeeRepo.save(employee);
    }


    public Employee getEmployeeId(Integer id) {

        return employeeRepo.findOne(id);

    }

    public void deleteEmpId(Integer id) {
        employeeRepo.delete(id);
    }
}
