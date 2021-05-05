package com.company.onurerkantoros.Business;

import com.company.onurerkantoros.Abstract.RealCheckService;
import com.company.onurerkantoros.MernisService.QVLKPSPublicSoap;
import com.company.onurerkantoros.Models.Customer;

public class MernisCheckManager implements RealCheckService {


    @Override
    public boolean checkCustomer( Customer customer) throws Exception {

            QVLKPSPublicSoap mernis = new QVLKPSPublicSoap();
            return mernis.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyID()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getBirthYear());


    }
}
