package com.onurerkantoros.hrms.Business.abstracts;

import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.Employer;

import java.util.List;

public interface  EmployerService {
    DataResult<List<Employer>> getAll();
    Result addEmployer(Employer employer);
}
