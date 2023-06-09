package com.example.bankaccount.service;

import com.example.bankaccount.entity.CurrentBalanceEntity;
import com.example.bankaccount.exception.BalanceNotFound;
import com.example.bankaccount.repository.CurrentBalanceRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;
import java.util.UUID;

@Data
@Log4j2
public class CurrentBalanceServiceImplementation implements CurrentBalanceService {
    private final CurrentBalanceRepository currentBalanceRepository;

    @Override
    public CurrentBalanceEntity getHandleAllBalance(UUID id) {
        currentBalanceRepository.findById(id);
        return null;
    }

    @Override
    public CurrentBalanceEntity createBalance(CurrentBalanceEntity currentBalanceEntity) throws BalanceNotFound {
        Optional<CurrentBalanceEntity> existCurrentBalanceEntity = currentBalanceRepository.findById(currentBalanceEntity.getId());

        existCurrentBalanceEntity
                .stream()
                .filter(balance -> balance.getId().equals(currentBalanceEntity.getId()))
                .findFirst().orElseThrow(() -> {
                    log.debug(new BalanceNotFound("Balance not found"));
                    return new BalanceNotFound("Balance not found");
                });

        return currentBalanceRepository.save(existCurrentBalanceEntity.get());
    }


    @Override
    public CurrentBalanceEntity updateBalance() {
        return null;
    }

    @Override
    public void deleteBalnce() {

    }
}
