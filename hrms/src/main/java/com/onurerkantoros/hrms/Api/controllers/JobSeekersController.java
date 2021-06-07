package com.onurerkantoros.hrms.Api.controllers;

import com.onurerkantoros.hrms.Business.abstracts.JobSeekerService;
import com.onurerkantoros.hrms.Cores.MernisService.FakeMernisServiceAdapter;
import com.onurerkantoros.hrms.Cores.MernisService.MernisServiceAdapter;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Cores.Utilities.Result.SuccessDataResult;
import com.onurerkantoros.hrms.DataAccess.abstracts.JobSeekersDao;
import com.onurerkantoros.hrms.Entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {

    private JobSeekerService jobSeekerService;
    @Autowired
    private JobSeekersDao jobSeekersDao;

    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getAll(){
        return new SuccessDataResult<>(this.jobSeekersDao.findAll());
    }

    @PostMapping("/add")
    public Result addJobSeeker(@RequestBody JobSeeker jobSeeker){
        return jobSeekerService.addJobSeeker(jobSeeker,new FakeMernisServiceAdapter());
    }
}
