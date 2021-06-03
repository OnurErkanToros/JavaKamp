package com.onurerkantoros.hrms.Cores.MernisService;

public class FakeMernisServiceAdapter implements MernisService{
    @Override
    public boolean checkTcKimlik(Long tcKimlikNo, String firstName, String lastName, int dogumYili) throws Exception {
        return true;
    }
}
