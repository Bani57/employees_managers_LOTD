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
        return "Welcome to the Employee and Manager Lord of The Rings API!";
    }
    @RequestMapping("/employees")
    public ArrayList<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }
    @RequestMapping("/employees/get")
    public List<Employee> getEmployeeByName(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName)
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

    @RequestMapping("/managers/{name}")
    public ArrayList<Manager> getManagerByName(@PathVariable String name)
    {
        return employeeService.getManagerByName(name);
    }
    @RequestMapping("employees/getByManager")
    public List<Employee> getEmployeesByManager(@RequestParam(value = "manager") String manager)
    {
        return employeeService.getByManager(manager);
    }
    @RequestMapping(value = "/managers/set",method = RequestMethod.POST)
    public void setManager(@RequestBody Manager manager)
    {
        employeeService.setManager(manager);
    }
}
