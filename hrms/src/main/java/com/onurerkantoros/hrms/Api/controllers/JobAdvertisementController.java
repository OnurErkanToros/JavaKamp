package com.onurerkantoros.hrms.Api.controllers;

import com.onurerkantoros.hrms.Business.abstracts.JobAdvertisementService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController {
    @Autowired
    private JobAdvertisementService jobAdvertisementService;

    @GetMapping("/getAll")
    DataResult<List<JobAdvertisement>> getAll() {
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/getAllActive")
    DataResult<List<JobAdvertisement>> getActiveAd() {
        return this.jobAdvertisementService.getActiveAd();
    }

    @GetMapping("/getAllActiveSorted")
    DataResult<List<JobAdvertisement>> getActiveAd(@RequestParam boolean isASC) {
        return this.jobAdvertisementService.getActiveAd(isASC);
    }

    @GetMapping("/getActiveByEmployer")
    DataResult<List<JobAdvertisement>> getActiveAdByEmployer(@RequestParam("employerId") int employerId) {
        return this.jobAdvertisementService.getActiveAdByEmployer(employerId);
    }

    @GetMapping("/getActiveByEmployerSorted")
    DataResult<List<JobAdvertisement>> getActiveAdByEmployer(@RequestParam int employerId,@RequestParam boolean isASC) {
        return this.jobAdvertisementService.getActiveAdByEmployer(employerId,isASC);
    }

    @PostMapping("/updateActivity")
    Result updateActivity(@RequestParam int id,@RequestParam boolean isActive) {
        return this.jobAdvertisementService.updateActivity(id,isActive);
    }

    @PostMapping("/addJobAdvertisement")
    Result add(JobAdvertisement jobAdvertisement) {
        return this.jobAdvertisementService.add(jobAdvertisement);
    }
}
