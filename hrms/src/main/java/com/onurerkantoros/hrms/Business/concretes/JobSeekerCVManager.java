package com.onurerkantoros.hrms.Business.concretes;

import com.onurerkantoros.hrms.Business.abstracts.JobSeekerCVService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.SuccessDataResult;
import com.onurerkantoros.hrms.DataAccess.abstracts.JobSeekerCVDao;
import com.onurerkantoros.hrms.Entities.concretes.JobSeekerCV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerCVManager implements JobSeekerCVService {
    private JobSeekerCVDao jobSeekerCVDao;

    @Autowired
    public JobSeekerCVManager(JobSeekerCVDao jobSeekerCVDao) {
        this.jobSeekerCVDao = jobSeekerCVDao;
    }

    @Override
    public DataResult<List<JobSeekerCV>> getAll() {
        return new SuccessDataResult<>(this.jobSeekerCVDao.findAll());
    }
}
