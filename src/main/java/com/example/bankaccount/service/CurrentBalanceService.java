package com.example.bankaccount.service;

import com.example.bankaccount.entity.CurrentBalanceEntity;
import com.example.bankaccount.exception.BalanceNotFound;

import java.util.UUID;

public interface CurrentBalanceService {

    public CurrentBalanceEntity getHandleAllBalance(UUID uuid);

    public CurrentBalanceEntity createBalance(CurrentBalanceEntity currentBalanceEntity) throws BalanceNotFound;

    public CurrentBalanceEntity updateBalance();

    public void deleteBalnce();
}
