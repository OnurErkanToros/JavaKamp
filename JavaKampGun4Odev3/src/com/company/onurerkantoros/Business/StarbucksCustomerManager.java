package com.company.onurerkantoros.Business;

import com.company.onurerkantoros.Abstract.BaseCustomerManager;
import com.company.onurerkantoros.Abstract.RealCheckService;
import com.company.onurerkantoros.Models.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    RealCheckService checkService;

    public StarbucksCustomerManager(RealCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        // Burada mernis kontrolünü sağlamamız lazım ama buraya direkt olarak mernisi yollarsak olmaz.
        // Neden olmaz ?
        // Şirket 5 ay sonra mernis ile kontrol etmek istemiyorum, kendi database'imi kullanmak istiyorum dedi
        // o zaman bütün kodlarla uğraşamız gerekir. Bunun yerine Dependency injection yapabiliriz.
        if (checkService.checkCustomer(customer)){
            super.save(customer);
        }
        else{
            throw new Exception("not a valid person");
        }




    }
}
