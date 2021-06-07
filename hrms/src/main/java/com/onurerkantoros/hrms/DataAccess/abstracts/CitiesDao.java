package com.onurerkantoros.hrms.DataAccess.abstracts;

import com.onurerkantoros.hrms.Entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesDao extends JpaRepository<City, Integer> {
}
