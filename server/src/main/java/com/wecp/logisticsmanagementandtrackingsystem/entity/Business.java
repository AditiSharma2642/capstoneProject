package com.wecp.logisticsmanagementandtrackingsystem.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46

import javax.persistence.*;
import java.util.List;

<<<<<<< HEAD

public class Business {
    // implement entity here
}
=======
@Entity
@Table(name="businesses")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;


    @OneToMany(mappedBy = "business")
    @JsonIgnore
    private List<Cargo> cargos;
    

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

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
