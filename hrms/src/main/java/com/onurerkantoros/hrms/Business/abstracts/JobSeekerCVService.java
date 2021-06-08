package com.onurerkantoros.hrms.Business.abstracts;

import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Entities.concretes.JobSeekerCV;

import java.util.List;

public interface JobSeekerCVService {
    DataResult<List<JobSeekerCV>> getAll();
}
