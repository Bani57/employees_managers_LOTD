package com.endava.intro_data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findEmployeeByRole(@Param("role") String role);
    List<Employee> findEmployeeByFirstNameOrRole(@Param("firstName") String firstName, @Param("role") String role);
    @Query("select employee from Employee employee where employee.firstName = :firstName and employee.lastName = :lastName")
    List<Employee> findAllByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
    List<Employee> findAllByManagerName(@Param("name") String name);
}
