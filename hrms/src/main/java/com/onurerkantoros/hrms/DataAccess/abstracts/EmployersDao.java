package com.onurerkantoros.hrms.DataAccess.abstracts;

import com.onurerkantoros.hrms.Entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployersDao extends JpaRepository<Employer,Integer> {
    List<Employer> findByEmail(String email);
}
