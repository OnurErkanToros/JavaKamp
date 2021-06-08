package com.onurerkantoros.hrms.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers_cv")
public class JobSeekerCV {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToOne
    @JoinColumn(name = "work_experience_id")
    private WorkExperience workExperience;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @Column(name = "github_account")
    private String githubAccount;

    @Column(name = "linkedin_account")
    private String linkedinAccount;

    @Column(name = "cover_letter")
    private String coverLetter;
}
