package com.wecp.logisticsmanagementandtrackingsystem.service;

import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Driver;
import com.wecp.logisticsmanagementandtrackingsystem.repository.CargoRepository;
import com.wecp.logisticsmanagementandtrackingsystem.repository.DriverRepository;
<<<<<<< HEAD
=======

>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

<<<<<<< HEAD

public class DriverService {
 // implement service logic here

}
=======
@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private CargoRepository cargoRepository;

    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }


    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public List<Cargo> viewDriverCargos(Long driverId) {
        return cargoRepository.findByDriverId(driverId);
    }

    public boolean updateCargoStatus(Long cargoId, String newStatus) {
        Cargo cargo = cargoRepository.findById(cargoId).orElseThrow(() -> new EntityNotFoundException("Cargo not found with id: " + cargoId));

        cargo.setStatus(newStatus);
        try {
            cargoRepository.save(cargo);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
