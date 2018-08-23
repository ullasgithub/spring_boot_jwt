package com.DAL.controller;

import com.DAL.entity.Employee;
import com.DAL.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getEmployee(){
        return employeeService.GetEmployee();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Employee> insertEmployee(@RequestBody final Employee employee){
      employeeService.insertEmployee(employee);
        return employeeService.GetEmployee();
    }

    @RequestMapping(value = "/id/{id}",method =  RequestMethod.GET)
    public Employee getEmployeeId(@PathVariable(value = "id") Integer id) {
            return employeeService.getEmployeeId(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE )
    public void deleteEmpId(@PathVariable(value = "id") Integer id)
    {
        employeeService.deleteEmpId(id);
    }

    @RequestMapping(value = "/update/{id}" , method = RequestMethod.PUT)
    public List<Employee> updateEmployee(@PathVariable(value = "id") Integer id, @Valid @RequestBody Employee empDetail){
        Employee employee = new Employee();
        employee.setId(empDetail.getId());
        employee.setName(empDetail.getName());
        employee.setLname(empDetail.getLname());
        employeeService.insertEmployee(employee);
        return employeeService.GetEmployee();

    }

}
