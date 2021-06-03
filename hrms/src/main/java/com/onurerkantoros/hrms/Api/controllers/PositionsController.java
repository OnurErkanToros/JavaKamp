package com.onurerkantoros.hrms.Api.controllers;

import com.onurerkantoros.hrms.Business.abstracts.PositionService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.Result;
import com.onurerkantoros.hrms.Entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/positions")
public class PositionsController {
    @Autowired
    private PositionService positionService;

    @GetMapping("/getall")
    public DataResult<List<Position>> getAll(){
        return positionService.getAll();
    }

    @PostMapping("/add")
    public Result addPosition(@RequestBody Position position){
        return positionService.addPosition(position);
    }
}
