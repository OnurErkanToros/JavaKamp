package com.onurerkantoros.hrms.Api.controllers;

import com.onurerkantoros.hrms.Business.abstracts.JobSeekerCVService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Entities.concretes.JobSeekerCV;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerCV")
public class JobSeekerCVsController {
    private JobSeekerCVService jobSeekerCVService;

    public JobSeekerCVsController(JobSeekerCVService jobSeekerCVService) {
        this.jobSeekerCVService = jobSeekerCVService;
    }

    @GetMapping("/getAll")
    DataResult<List<JobSeekerCV>> getAll(){
        return this.jobSeekerCVService.getAll();
    }
}
