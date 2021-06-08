package com.onurerkantoros.hrms.Business.abstracts;

import com.onurerkantoros.hrms.Cores.ForeignServices.MernisService.MernisService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeeker>> getAll();
    Result addJobSeeker(JobSeeker jobSeeker, MernisService mernisService);
}
