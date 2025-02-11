package com.wecp.logisticsmanagementandtrackingsystem.repository;


import com.wecp.logisticsmanagementandtrackingsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD

public interface UserRepository  {
    // extend jpa repository and add custom methods if needed
}
=======
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // extend jpa repository and add custom methods if needed
    User findByUsername(String username);

    // public boolean existsByEmail(String email);
    // public boolean existsByUsername(String username);


}
>>>>>>> 1b4d1814d850f0219a666c7d9f66690b21047e46
