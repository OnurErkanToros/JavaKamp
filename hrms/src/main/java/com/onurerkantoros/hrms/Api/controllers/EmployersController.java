package com.onurerkantoros.hrms.Api.controllers;

import com.onurerkantoros.hrms.Business.abstracts.EmployerService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
    @Autowired
    private EmployerService employerService;

    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }
    @PostMapping("/add")
    public Result addEmployer(@RequestBody Employer employer){
        return this.employerService.addEmployer(employer);
    }
}
