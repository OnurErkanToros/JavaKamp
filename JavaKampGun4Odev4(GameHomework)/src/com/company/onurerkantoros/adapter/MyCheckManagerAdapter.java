package com.company.onurerkantoros.adapter;

import com.company.onurerkantoros.abstracts.GamerCheckService;
import com.company.onurerkantoros.models.Gamer;

public class MyCheckManagerAdapter implements GamerCheckService {
    @Override
    public boolean checkGamer(Gamer gamer) throws Exception {
        return true;
    }
}
