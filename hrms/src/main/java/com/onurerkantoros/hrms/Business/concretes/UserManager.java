package com.onurerkantoros.hrms.Business.concretes;

import com.onurerkantoros.hrms.Business.abstracts.UserService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.SuccessDataResult;
import com.onurerkantoros.hrms.DataAccess.abstracts.UsersDao;
import com.onurerkantoros.hrms.Entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    @Autowired
    private UsersDao usersDao;

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<>(this.usersDao.findAll());
    }
}
