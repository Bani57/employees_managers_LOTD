package com.endava.intro_data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ManagerRepository extends CrudRepository<Manager, Long> {

    //List<Manager> findByEmployeesRoleContains(@Param("role") String role);

    @Query("select manager from Manager manager where manager.name = :name")
    List<Manager> adafsafasfsa(@Param("name") String name);

}
