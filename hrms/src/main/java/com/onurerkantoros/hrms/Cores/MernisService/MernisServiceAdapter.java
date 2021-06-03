package com.onurerkantoros.hrms.Cores.MernisService;

import com.onurerkantoros.hrms.Cores.MernisService.Mernis.DSWKPSPublicSoap;

public class MernisServiceAdapter implements MernisService {
    @Override
    public boolean checkTcKimlik(Long tcKimlikNo, String firstName, String lastName, int dogumYili) throws Exception {
        DSWKPSPublicSoap mernis = new DSWKPSPublicSoap();
        return mernis.TCKimlikNoDogrula(tcKimlikNo,firstName,lastName,dogumYili);
    }
}
