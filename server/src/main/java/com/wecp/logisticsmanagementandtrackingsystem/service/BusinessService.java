package com.wecp.logisticsmanagementandtrackingsystem.service;


import com.wecp.logisticsmanagementandtrackingsystem.entity.Business;
import com.wecp.logisticsmanagementandtrackingsystem.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD

public class BusinessService {
    // implement service logic here
   
}
=======
@Service
public class BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    public Business saveBusiness(Business business) {
        return businessRepository.save(business);
    }
    
}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
