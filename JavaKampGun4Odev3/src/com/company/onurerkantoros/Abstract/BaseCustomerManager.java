package com.company.onurerkantoros.Abstract;

import com.company.onurerkantoros.Models.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Veri tabanına kaydedildi : "+customer.getFirstName());
    }
}
