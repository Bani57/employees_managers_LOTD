package com.endava.intro_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String welcome()
    {
        return "Welcome to the Employee and Manager Lord of The Ring API!";
    }
    @RequestMapping("/employees")
    public ArrayList<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }
    @RequestMapping("/employees/{firstName}_{lastName}")
    public Employee getEmployeeByName(@PathVariable String firstName,@PathVariable String lastName)
    {
        return employeeService.getByName(firstName,lastName);
    }
    @RequestMapping("/employees/{role}")
    public List<Employee> getEmployeesByRole(@PathVariable String role)
    {
        return employeeService.getByRole(role);
    }
    @RequestMapping(value = "/employees/set", method = RequestMethod.POST)
    public void setEmployee(@RequestBody Employee employee)
    {
        employeeService.setEmployee(employee);
    }

    @RequestMapping("/managers")
    public ArrayList<Manager> getAllManagers()
    {
        return employeeService.getAllManagers();
    }

}
