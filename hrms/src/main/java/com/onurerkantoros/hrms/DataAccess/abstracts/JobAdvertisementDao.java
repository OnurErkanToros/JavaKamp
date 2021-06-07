package com.onurerkantoros.hrms.DataAccess.abstracts;

import com.onurerkantoros.hrms.Entities.concretes.JobAdvertisement;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    JobAdvertisement findByJobadvertisementId(int id);
    List<JobAdvertisement> getByIsActive(boolean isActive);
    List<JobAdvertisement> getByIsActive(boolean isActive, Sort sort);
    List<JobAdvertisement> getByIsActiveAndEmployer(boolean isActive,int employerId);
    List<JobAdvertisement> getByIsActiveAndEmployer(boolean isActive,int employerId,Sort sort);
}
