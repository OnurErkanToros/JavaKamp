package com.onurerkantoros.hrms.DataAccess.abstracts;

import com.onurerkantoros.hrms.Entities.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PositionsDao extends JpaRepository<Position,Integer> {

    List<Position> findByPositionName(String positionName);
}
