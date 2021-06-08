package com.onurerkantoros.hrms.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "work_experiences")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_experience_id")
    private int id;

    @Column(name = "workplace_name")
    private String workplaceName;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "quit_date")
    private LocalDate quitDate;

    @Column(name = "is_continue")
    private boolean isContinue;
}
