package com.onurerkantoros.hrms.DataAccess.abstracts;

import com.onurerkantoros.hrms.Entities.concretes.JobSeekerCV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerCVDao extends JpaRepository<JobSeekerCV,Integer> {
}
