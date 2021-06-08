package com.onurerkantoros.hrms.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name = "job_seekers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "jobseeker_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeekerCVList"})
public class JobSeeker extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "citizenship_number")
    private String citizenshipNumber;

    @Column(name = "birth_date")
    private Date yearOfBirth;

    @OneToMany(mappedBy = "jobSeeker",fetch = FetchType.LAZY)
    List<JobSeekerCV> jobSeekerCVList;

}