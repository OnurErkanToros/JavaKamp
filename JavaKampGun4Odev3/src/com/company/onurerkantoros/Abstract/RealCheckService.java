package com.company.onurerkantoros.Abstract;

import com.company.onurerkantoros.Models.Customer;

public interface RealCheckService {
    boolean checkCustomer(Customer customer) throws Exception;
}
