package com.wecp.logisticsmanagementandtrackingsystem.Controller;


<<<<<<< HEAD
import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Driver;
import com.wecp.logisticsmanagementandtrackingsystem.service.CargoService;
import com.wecp.logisticsmanagementandtrackingsystem.service.DriverService;
=======
import com.wecp.logisticsmanagementandtrackingsystem.entity.Business;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Driver;
import com.wecp.logisticsmanagementandtrackingsystem.jwt.JwtUtil;
import com.wecp.logisticsmanagementandtrackingsystem.service.BusinessService;
import com.wecp.logisticsmanagementandtrackingsystem.service.CargoService;
import com.wecp.logisticsmanagementandtrackingsystem.service.DriverService;

>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

<<<<<<< HEAD
public class BusinessController {

    @PostMapping("/api/business/cargo")
    public ResponseEntity<Cargo> addCargo(@RequestBody Cargo cargo) {
        // add cargo  and return the added cargo with status code 200
    }

    @GetMapping("/api/business/drivers")
    public ResponseEntity<List<Driver>> getAllDrivers() {{
        // return list of drivers
    }

    @GetMapping("/api/business/cargo")
    public ResponseEntity<List<Cargo>> viewAllCargos() {
        // return all cargos with status code 200
    }

    @@PostMapping("/api/business/assign-cargo")
    public ResponseEntity<String> assignCargoToDriver(@RequestParam Long cargoId, @RequestParam Long driverId) {
        // assign cargo to a driver
        // if assignment is sucess return with sucess message
    }
}
=======
import javax.servlet.http.HttpServletRequest;

@RestController
@EnableWebMvc
public class BusinessController {

    @Autowired
    private CargoService cargoService;


    @Autowired
    private DriverService driverService;

    @PostMapping("/api/business/cargo")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Cargo> addCargo(@RequestBody Cargo cargo) {
        Cargo addedCargo = cargoService.addCargo(cargo);
        return new ResponseEntity<>(addedCargo, HttpStatus.OK);
    }

    @GetMapping("/api/business/drivers")
    public ResponseEntity<List<Driver>> getAllDrivers() {
        List<Driver> allDrivers = driverService.getAllDrivers();
        return ResponseEntity.ok(allDrivers);
    }


    @GetMapping("/api/business/cargo")
    public ResponseEntity<List<Cargo>> viewAllCargos() {
        List<Cargo> allCargos = cargoService.viewAllCargos();
        return ResponseEntity.ok(allCargos);
    }

    @PostMapping("/api/business/assign-cargo")
    public ResponseEntity<String> assignCargoToDriver(@RequestParam Long cargoId, @RequestParam Long driverId) {
        boolean assignmentSuccess = cargoService.assignCargoToDriver(cargoId, driverId);

        if (assignmentSuccess) {
            return ResponseEntity.ok().body("{\"message\": \"Cargo assigned successfully.\"}");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to assign cargo.");
        }
    }
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
