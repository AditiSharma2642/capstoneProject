package com.wecp.logisticsmanagementandtrackingsystem.Controller;


import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import com.wecp.logisticsmanagementandtrackingsystem.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

<<<<<<< HEAD

public class DriverController {

    @GetMapping("/api/driver/cargo")
    public ResponseEntity<List<Cargo>> viewAssignedCargos(@RequestParam Long driverId) {
        // get assigned cargos for the driver and return with 200 OK
=======
@RestController
@RequestMapping("/api/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/cargo")
    public ResponseEntity<List<Cargo>> viewAssignedCargos(@RequestParam Long driverId) {
        List<Cargo> assignedCargos = driverService.viewDriverCargos(driverId);
        return ResponseEntity.ok(assignedCargos);
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
    }

    @PutMapping("/update-cargo-status")
    public ResponseEntity<String> updateCargoStatus(@RequestParam Long cargoId, @RequestParam String newStatus) {
<<<<<<< HEAD
        // update the cargo status
        // if cargo update sucessfully return sucess message
        // if cargo update failed return failuer message 
    }


}
=======
        boolean updateSuccess = driverService.updateCargoStatus(cargoId, newStatus);

        if (updateSuccess) {
            
            return ResponseEntity.ok().body("{\"message\": \"Cargo status updated successfully.\"}");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update cargo status.");
        }
    }


}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
