package com.onurerkantoros.hrms.Business.abstracts;

import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.JobAdvertisement;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getActiveAd();
    DataResult<List<JobAdvertisement>> getActiveAd(boolean isASC);
    DataResult<List<JobAdvertisement>> getActiveAdByEmployer(int employerId);
    DataResult<List<JobAdvertisement>> getActiveAdByEmployer(int employerId, boolean isASC);
    Result updateActivity(int id,boolean isActive);
    Result add(JobAdvertisement jobAdvertisement);
}
