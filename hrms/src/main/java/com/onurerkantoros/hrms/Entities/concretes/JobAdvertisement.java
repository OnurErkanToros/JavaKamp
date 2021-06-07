package com.onurerkantoros.hrms.Entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "job_advertisement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

    @Id
    @Column(name = "jobadvertisement_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobadvertisementId;


    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "job_description")
    private String jobDescription;


    @Column(name = "salary_max")
    private Integer salaryMax;

    @Column(name = "salary_min")
    private Integer salaryMin;

    @Column(name = "quota")
    private int quota;

    @Column(name = "application_deadline")
    private LocalDate applicationDeadline;

    @Column(name = "listing_date")
    private LocalDate listingDate;

    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}
