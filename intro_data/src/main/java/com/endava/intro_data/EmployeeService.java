package com.endava.intro_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ManagerRepository managerRepository;
    public ArrayList<Employee> getAllEmployees()
    {
        return (ArrayList<Employee>)employeeRepository.findAll();
    }
    public void setEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }
    public void setRole(Employee employee, String role)
    {
        employeeRepository.save(employee);
    }
    public List<Employee> getByName(String firstName,String lastName)
    {
        return employeeRepository.findAllByFirstNameAndLastName(firstName,lastName);
    }
    public List<Employee> getByRole(String role)
    {
        return employeeRepository.findEmployeeByRole(role);
    }
    public ArrayList<Manager> getAllManagers()
    {
        return (ArrayList<Manager>)managerRepository.findAll();
    }
    public ArrayList<Manager> getManagerByName(String name)
    {
        return (ArrayList<Manager>)managerRepository.adafsafasfsa(name);
    }
    public List<Employee> getByManager(String manager)
    {
        return employeeRepository.findAllByManagerName(manager);
    }
    public void setManager(Manager manager)
    {
        managerRepository.save(manager);
    }
}
