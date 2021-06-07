package com.onurerkantoros.hrms.Api.controllers;

import com.onurerkantoros.hrms.Business.abstracts.SystemPersonService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.SystemPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.RelationSupport;
import java.util.List;

@RestController
@RequestMapping("/api/systemPersons")
public class SystemPersonsController {
    @Autowired
    private SystemPersonService systemPersonService;

    @GetMapping("/getall")
    public DataResult<List<SystemPerson>> getAll(){
        return systemPersonService.getAll();
    }

    @PostMapping("/add")
    public Result addSystemPerson(@RequestBody SystemPerson systemPerson){
        return systemPersonService.addSystemPersonService(systemPerson);
    }
}
