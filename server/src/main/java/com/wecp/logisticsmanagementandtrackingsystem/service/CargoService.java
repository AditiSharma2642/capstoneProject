package com.wecp.logisticsmanagementandtrackingsystem.service;

<<<<<<< HEAD
=======
import com.wecp.logisticsmanagementandtrackingsystem.entity.Business;
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Driver;
import com.wecp.logisticsmanagementandtrackingsystem.repository.CargoRepository;
import com.wecp.logisticsmanagementandtrackingsystem.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

<<<<<<< HEAD

public class CargoService {
 // implement service logic here
}
=======
@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private DriverRepository driverRepository;

    public Cargo addCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public List<Cargo> viewAllCargos() {
        return cargoRepository.findAll();
    }

    public boolean assignCargoToDriver(Long cargoId, Long driverId) {
        Cargo cargo = cargoRepository.findById(cargoId)
                .orElseThrow(() -> new EntityNotFoundException("Cargo not found with id: " + cargoId));

        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new EntityNotFoundException("Driver not found with id: " + driverId));

        cargo.setDriver(driver);
        cargoRepository.save(cargo);
        return true;
    }
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
