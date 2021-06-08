package com.onurerkantoros.hrms.Cores.ForeignServices.MernisService;

public interface MernisService {
    boolean checkTcKimlik(final Long tcKimlikNo,String firstName,String lastName,int dogumYili) throws Exception;
}
