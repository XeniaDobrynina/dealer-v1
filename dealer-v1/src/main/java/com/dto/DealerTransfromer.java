package com.dto;

import com.entity.Dealer;
import org.springframework.beans.BeanUtils;

public class DealerTransfromer {

    public Dealer transform(DealerDto dto){
        Dealer dealer = new Dealer();
        BeanUtils.copyProperties(dto,dealer);
        return dealer;
    }
}
