package com.company.onurerkantoros.Business;

import com.company.onurerkantoros.Abstract.RealCheckService;
import com.company.onurerkantoros.Models.Customer;

public class CustomerCheckManagerMy implements RealCheckService {
    @Override
    public boolean checkCustomer(Customer customer) {
        return true;
    }
}
