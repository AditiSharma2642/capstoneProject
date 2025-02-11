package com.wecp.logisticsmanagementandtrackingsystem.entity;
<<<<<<< HEAD


=======
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

<<<<<<< HEAD

public class Cargo {
    // implement entity here
}

=======
@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String size;
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="business_id")
    private Business business;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="driver_id")
    private Driver driver;

    public Cargo() {
    }

    public Cargo(Long id, String content, String size, String status) {
        this.id = id;
        this.content = content;
        this.size = size;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
