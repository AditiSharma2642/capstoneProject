package com.wecp.logisticsmanagementandtrackingsystem.repository;


import com.wecp.logisticsmanagementandtrackingsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD

public interface CustomerRepository  {
=======
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
    // extends JpaRepository and add custom methods if needed
}