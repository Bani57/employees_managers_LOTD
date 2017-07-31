package com.endava.intro_data;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Manager{

    @Id
    @GeneratedValue
    Long id;

    String name;

    //@OneToMany(mappedBy = "manager")
    //List<Employee> employees;

    private Manager() {
    }

    public Manager(String name) {
        this.name = name;
    }
}
