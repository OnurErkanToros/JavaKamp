package com.onurerkantoros.hrms.Business.concretes;

import com.onurerkantoros.hrms.Business.abstracts.SystemPersonService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Cores.Utilities.Result.SuccessDataResult;
import com.onurerkantoros.hrms.DataAccess.abstracts.SystemPersonsDao;
import com.onurerkantoros.hrms.Entities.concretes.SystemPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonManager implements SystemPersonService {
    @Autowired
    private SystemPersonsDao systemPersonsDao;

    @Override
    public DataResult<List<SystemPerson>> getAll() {
        return new SuccessDataResult<List<SystemPerson>>(this.systemPersonsDao.findAll(),"Bütün sistem personeli listelendi.");
    }

    @Override
    public Result addSystemPersonService(SystemPerson systemPerson) {
        this.systemPersonsDao.save(systemPerson);
        return new  SuccessDataResult("Sistem personeli başarıyla eklendi.");
    }
}
