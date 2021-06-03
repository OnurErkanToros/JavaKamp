package com.onurerkantoros.hrms.Business.abstracts;

import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Entities.concretes.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
}
