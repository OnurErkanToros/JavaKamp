package com.onurerkantoros.hrms.Business.concretes;

import com.onurerkantoros.hrms.Business.abstracts.JobSeekerService;
import com.onurerkantoros.hrms.Cores.MernisService.MernisService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.*;
import com.onurerkantoros.hrms.DataAccess.abstracts.JobSeekersDao;
import com.onurerkantoros.hrms.Entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerManager implements JobSeekerService {
    @Autowired
    private JobSeekersDao jobSeekersDao;
    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<>(this.jobSeekersDao.findAll(),"İş arayanlar listelendi.");
    }

    @Override
    public Result addJobSeeker(JobSeeker jobSeeker,MernisService mernisService) {
        try{
            return validateAndCheckJobSeeker(jobSeeker,mernisService);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ErrorResult("Bir sorunumuz var.");
    }
    private Result validateAndCheckJobSeeker(JobSeeker jobSeeker,MernisService mernisService) throws Exception{
        if(mernisService.checkTcKimlik(Long.getLong(jobSeeker.getCitizenshipNumber()),jobSeeker.getFirstName(),jobSeeker.getLastName(),jobSeeker.getYearOfBirth().getYear())){
            if(checkJobSeekerByEmail(jobSeeker.getEmail())){
                return new ErrorResult("Mernis doğrulaması başarılı fakat bu mail adresi kayıtlı :(");
            }else if (checkJobSeekerByTCKimlik(jobSeeker.getCitizenshipNumber())){
                return new ErrorResult("Mernis doğrulaması başarılı fakat bu tc kimlik numarası kayıtlı :( ");
            }else {
                this.jobSeekersDao.save(jobSeeker);
                return new SuccessResult("Mernis doğrulaması ve kayıt başarılı :)");
            }
        }else {
            return new ErrorResult("Mernis doğrulaması başarısız.");
        }
    }
    private boolean checkJobSeekerByEmail(String email){
        return !this.jobSeekersDao.findByEmail(email).isEmpty();
    }
    private boolean checkJobSeekerByTCKimlik(String tcKimlik){
        return !this.jobSeekersDao.findByCitizenshipNumber(tcKimlik).isEmpty();
    }
}
