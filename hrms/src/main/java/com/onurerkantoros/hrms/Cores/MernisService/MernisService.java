package com.onurerkantoros.hrms.Cores.MernisService;

public interface MernisService {
    boolean checkTcKimlik(final Long tcKimlikNo,String firstName,String lastName,int dogumYili) throws Exception;
}
