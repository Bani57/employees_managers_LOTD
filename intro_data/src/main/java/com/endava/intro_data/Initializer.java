package com.endava.intro_data;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initializer {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository, ManagerRepository managerRepository) {
        return (args) -> {
            Manager gandalf = managerRepository.save(new Manager("Gandalf"));
            Manager sauron = managerRepository.save(new Manager("Sauron"));
            employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer", gandalf));
            employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar", gandalf));
            employeeRepository.save(new Employee("Saruman","","evil wizard", sauron));

        };
    }
}
