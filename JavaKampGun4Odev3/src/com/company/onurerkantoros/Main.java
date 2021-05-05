package com.company.onurerkantoros;

import com.company.onurerkantoros.Business.MernisCheckManager;
import com.company.onurerkantoros.Business.NeroCustomerManager;
import com.company.onurerkantoros.Business.StarbucksCustomerManager;
import com.company.onurerkantoros.Abstract.BaseCustomerManager;
import com.company.onurerkantoros.Models.Customer;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisCheckManager());
        customerManager.save(new Customer(1,"Onur Erkan","Toros","12312312312",1999));
    }
}
