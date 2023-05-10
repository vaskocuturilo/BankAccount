package com.example.bankaccount.service;

import com.example.bankaccount.entity.CurrentBalanceEntity;

import java.util.UUID;

public interface CurrentBalanceService {

    public CurrentBalanceEntity getHandleAllBalance(UUID uuid);

    public CurrentBalanceEntity createBalance();

    public CurrentBalanceEntity updateBalance();

    public void deleteBalnce();
}
