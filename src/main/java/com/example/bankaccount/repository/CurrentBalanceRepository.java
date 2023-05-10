package com.example.bankaccount.repository;

import com.example.bankaccount.entity.CurrentBalanceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CurrentBalanceRepository extends CrudRepository<CurrentBalanceEntity, UUID> {
}
