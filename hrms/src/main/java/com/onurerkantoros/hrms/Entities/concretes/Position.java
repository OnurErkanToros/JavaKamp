package com.onurerkantoros.hrms.Entities.concretes;

import com.onurerkantoros.hrms.Entities.abstracts.Positions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "positions")
@AllArgsConstructor
@NoArgsConstructor
public class Position implements Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private int id;

    @Column(name = "position_name")
    private String positionName;
}
