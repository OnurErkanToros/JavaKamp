package com.onurerkantoros.hrms.Business.concretes;

import com.onurerkantoros.hrms.Business.abstracts.EmployerService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.*;
import com.onurerkantoros.hrms.DataAccess.abstracts.EmployerDao;
import com.onurerkantoros.hrms.Entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {
    @Autowired
    private EmployerDao employerDao;

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>("İşverenler listelendi.",this.employerDao.findAll());
    }

    @Override
    public Result addEmployer(Employer employer) {
        if(checkExistByEmployerEmail(employer.getEmail())){
            this.employerDao.save(employer);
            return new SuccessResult("İşveren başarıyla eklendi kanka ;)");
        }
        return new ErrorResult("İşveren için aynı email adresinden bulunduğu için ekleyemiyorum :(");

    }

    private boolean checkExistByEmployerEmail(String email){
        return !this.employerDao.findByEmail(email).isEmpty();
    }

}
