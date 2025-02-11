package com.wecp.logisticsmanagementandtrackingsystem.service;


import com.wecp.logisticsmanagementandtrackingsystem.dto.CargoStatusResponse;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Cargo;
import com.wecp.logisticsmanagementandtrackingsystem.entity.Customer;
import com.wecp.logisticsmanagementandtrackingsystem.repository.CargoRepository;
import com.wecp.logisticsmanagementandtrackingsystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD

public class CustomerService {
 // implement service logic here
}
=======
@Service
public class CustomerService {

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public CargoStatusResponse viewCargoStatus(Long cargoId) {
        Cargo cargo = cargoRepository.findById(cargoId).orElse(null);
        if (cargo != null) {
            return new CargoStatusResponse(cargo.getId(), cargo.getStatus());
        } else {
            return null;
        }
    }
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
