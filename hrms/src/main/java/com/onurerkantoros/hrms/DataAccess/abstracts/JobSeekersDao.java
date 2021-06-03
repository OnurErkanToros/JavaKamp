package com.onurerkantoros.hrms.DataAccess.abstracts;

import com.onurerkantoros.hrms.Entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekersDao extends JpaRepository<JobSeeker,Integer> {

    List<JobSeeker> findByEmail(String email);
    List<JobSeeker> findByCitizenshipNumber(String citizenshipNumber);
}
