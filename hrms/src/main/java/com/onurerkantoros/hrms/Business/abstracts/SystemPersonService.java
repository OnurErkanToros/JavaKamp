package com.onurerkantoros.hrms.Business.abstracts;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.SystemPerson;
import jdk.jfr.consumer.RecordedStackTrace;

import java.util.List;

public interface SystemPersonService {
    DataResult<List<SystemPerson>> getAll();
    Result addSystemPersonService(SystemPerson systemPerson);
}
