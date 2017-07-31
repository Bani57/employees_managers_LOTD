package com.endava.intro_data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findEmployeeByRole(@Param("role") String role);
    List<Employee> findEmployeeByFirstNameOrRole(@Param("firstName") String firstName, @Param("role") String role);
    Employee findOneByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
    List<Employee> findAllByRole(@Param("role") String role);
}
