package com.onurerkantoros.hrms.Cores.ForeignServices.MernisService;

import com.onurerkantoros.hrms.Cores.ForeignServices.MernisService.Mernis.DSWKPSPublicSoap;

public class MernisServiceAdapter implements MernisService {
    @Override
    public boolean checkTcKimlik(Long tcKimlikNo, String firstName, String lastName, int dogumYili) throws Exception {
        DSWKPSPublicSoap mernis = new DSWKPSPublicSoap();
        return mernis.TCKimlikNoDogrula(tcKimlikNo,firstName,lastName,dogumYili);
    }
}
