package com.services.serviceImpl;

import com.dto.DealerTransfromer;
import com.entity.Dealer;
import com.repo.DealerRepository;
import com.services.BaseService;
import com.services.IDealerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DealerServiceImpl extends BaseService implements IDealerService {

    private DealerRepository repository;

    private DealerTransfromer transfromer;

    @Autowired
    public DealerServiceImpl(DealerRepository repository, DealerTransfromer transfromer) {
        this.repository = repository;
        this.transfromer = transfromer;
    }

    @Override
    public Dealer getDealer(String id) {
        return repository.findById(id).map(dealerDto -> transfromer.transform(dealerDto)).orElse(new Dealer());
    }

    @Override
    public List<Dealer> getAllUsers() {
        return null;
    }

    @Override
    public String createUser(Dealer user) {
     return "";
    }

    @Override
    public void updateUser(Dealer user) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
