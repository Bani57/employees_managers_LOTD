package com.endava.intro_data;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Employee
{
    @Id
    @GeneratedValue
    Long id;

    String firstName;
    String lastName;
    String role;

    @ManyToOne
    Manager manager;

    private Employee(){}

    public Employee(String firstName, String lastName, String role, Manager manager){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.manager = manager;
    }
}
