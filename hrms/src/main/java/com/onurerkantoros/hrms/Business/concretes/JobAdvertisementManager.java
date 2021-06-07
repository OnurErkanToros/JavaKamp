package com.onurerkantoros.hrms.Business.concretes;

import com.onurerkantoros.hrms.Business.abstracts.JobAdvertisementService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Cores.Utilities.Result.SuccessDataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.SuccessResult;
import com.onurerkantoros.hrms.DataAccess.abstracts.JobAdvertisementDao;
import com.onurerkantoros.hrms.Entities.concretes.JobAdvertisement;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    @Autowired
    private JobAdvertisementDao jobAdvertisementDao;

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll());
    }

    @Override
    public DataResult<List<JobAdvertisement>> getActiveAd() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getByIsActive(true));
    }

    @Override
    public DataResult<List<JobAdvertisement>> getActiveAd(boolean isASC) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getByIsActive(true,isASC(isASC,"listingDate")));
    }



    @Override
    public DataResult<List<JobAdvertisement>> getActiveAdByEmployer(int employerId) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getByIsActiveAndEmployer(true,employerId));
    }
    @Override
    public DataResult<List<JobAdvertisement>> getActiveAdByEmployer(int employerId, boolean isASC) {

        return new SuccessDataResult<>(this.jobAdvertisementDao.getByIsActiveAndEmployer(true,employerId,isASC(isASC,"listingDate")));
    }

    @Override
    public Result updateActivity(int id,boolean isActive) {
        JobAdvertisement jobAdvertisement= this.jobAdvertisementDao.findByJobadvertisementId(id);
        if (jobAdvertisement==null) {
            return null;
        }
        jobAdvertisement.setActive(isActive);
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new  SuccessResult("Güncelleme başarılı");

    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Ekleme başarılı.");
    }
    private Sort isASC(boolean isASC,String property){
        if(isASC){
            return Sort.by(Sort.Direction.ASC,property);
        }
        return Sort.by(Sort.Direction.DESC,property);
    }

}
