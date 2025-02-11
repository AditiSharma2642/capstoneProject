package com.wecp.logisticsmanagementandtrackingsystem.repository;


<<<<<<< HEAD
import com.wecp.logisticsmanagementandtrackingsystem.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DriverRepository  {
    // extend jpa repository and add custom methods if needed
}

=======
import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Driver;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository  extends JpaRepository<Driver,Long>{

    Driver findByUserId(Long userId);
    // extend jpa repository and add custom methods if needed
   
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
