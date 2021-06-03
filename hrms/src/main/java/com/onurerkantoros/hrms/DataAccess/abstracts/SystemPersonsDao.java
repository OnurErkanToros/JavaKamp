package com.onurerkantoros.hrms.DataAccess.abstracts;

import com.onurerkantoros.hrms.Entities.concretes.SystemPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPersonsDao extends JpaRepository<SystemPerson,Integer> {
}
