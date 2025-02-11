package com.wecp.logisticsmanagementandtrackingsystem.Controller;


import com.wecp.logisticsmanagementandtrackingsystem.dto.CargoStatusResponse;
<<<<<<< HEAD
=======
import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
import com.wecp.logisticsmanagementandtrackingsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD

public class CustomerController {

    @GetMapping("/api/customer/cargo-status")
    public ResponseEntity<CargoStatusResponse> viewCargoStatus(@RequestParam Long cargoId) {

        // get cargo status and return it with status code 200

        // if cargo status is not found, return 404 status code
    }

}
=======
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/cargo-status")
    public ResponseEntity<CargoStatusResponse> viewCargoStatus(@RequestParam Long cargoId) {
        CargoStatusResponse cargoStatusResponse = customerService.viewCargoStatus(cargoId);

        if (cargoStatusResponse != null) {
            return ResponseEntity.ok(cargoStatusResponse);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
