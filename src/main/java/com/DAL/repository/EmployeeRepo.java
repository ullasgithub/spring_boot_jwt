package com.DAL.repository;

import com.DAL.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
}
