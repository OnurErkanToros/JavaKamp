package com.onurerkantoros.hrms.Business.concretes;

import com.onurerkantoros.hrms.Business.abstracts.PositionService;
import com.onurerkantoros.hrms.Cores.Utilities.Result.*;
import com.onurerkantoros.hrms.DataAccess.abstracts.PositionsDao;
import com.onurerkantoros.hrms.Entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PositionManager implements PositionService {

    private PositionsDao positionsDao;
    @Autowired
    public PositionManager(PositionsDao positionsDao){
        this.positionsDao=positionsDao;
    }
    @Override
    public DataResult<List<Position>> getAll() {
        return  new SuccessDataResult<>(this.positionsDao.findAll());
    }

    @Override
    public Result addPosition(Position position) {
        return checkExist(position);
    }
    private Result checkExist(Position position){
        if (this.positionsDao.findByPositionName(position.getPositionName()).isEmpty()){
            this.positionsDao.save(position);
            return new SuccessResult("Pozisyon başarıyla eklendi kanka ;)");
        }
        return new ErrorResult("Bu pozisyondan zaten var :(");
    }
}
