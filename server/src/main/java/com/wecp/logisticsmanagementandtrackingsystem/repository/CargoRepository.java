package com.wecp.logisticsmanagementandtrackingsystem.repository;


import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Query;
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import org.springframework.stereotype.Repository;

import java.util.List;

<<<<<<< HEAD

public interface CargoRepository {
    // extend jpa repository to add custom query methods if needed

}
=======
@Repository
public interface CargoRepository extends JpaRepository<Cargo,Long> {
    //List<Cargo> findAllByDriverId(Long driverId);
    // extend jpa repository to add custom query methods if needed

    List<Cargo> findByBusinessId(Long businessId);
    List<Cargo> findByDriverId(Long driverId);

}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
