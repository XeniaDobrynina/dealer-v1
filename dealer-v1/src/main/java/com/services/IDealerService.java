package com.services;

import com.entity.Dealer;

import java.util.List;


public interface IDealerService {
    Dealer getDealer(String id);
    List<Dealer> getAllUsers();
    String createUser(Dealer user);
    void updateUser(Dealer user);
    void deleteUser(String id);

}
