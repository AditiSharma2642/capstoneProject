package com.wecp.logisticsmanagementandtrackingsystem.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46

import javax.persistence.*;
import java.util.List;

<<<<<<< HEAD

public class Driver {
     // implement entity here
}
=======
@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long userId; 

    @OneToMany(mappedBy = "driver")
    @JsonIgnore
    private List<Cargo> assignedCargos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setAssignedCargos(List<Cargo> assignedCargos) {
        this.assignedCargos = assignedCargos;
    }

    public List<Cargo> getAssignedCargos() {
        return assignedCargos;
    }


}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
