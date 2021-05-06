package com.company.onurerkantoros.adapter;

import com.company.onurerkantoros.abstracts.GamerCheckService;
import com.company.onurerkantoros.mernisService.RBCKPSPublicSoap;
import com.company.onurerkantoros.models.Gamer;

public class MernisCheckManagerAdapter implements GamerCheckService {
    @Override
    public boolean checkGamer(Gamer gamer) throws Exception{
        RBCKPSPublicSoap mernisCheck = new RBCKPSPublicSoap();
        return mernisCheck.TCKimlikNoDogrula(
                Long.parseLong(gamer.getNationalityId()),
                gamer.getFirstName(),
                gamer.getLastName(),
                gamer.getYearOfBirth()
        );
    }
}
