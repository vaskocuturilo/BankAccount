package com.example.bankaccount.resource;

import com.example.bankaccount.entity.CurrentBalanceEntity;
import com.example.bankaccount.exception.BalanceNotFound;
import com.example.bankaccount.service.CurrentBalanceServiceImplementation;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/balance")
@Log4j2
@Data
public class CurrentBalanceResource {
    private final CurrentBalanceServiceImplementation currentBalanceServiceImplementation;

    @GetMapping("/{id}/all")
    public ResponseEntity getHandleAllBalance(@PathVariable UUID uuid) {
        log.info("The getHandleAllBalance Method");
        try {
            return ResponseEntity.ok().body(currentBalanceServiceImplementation.getHandleAllBalance(uuid));
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body("Users not found" + exception.getMessage());
        }
    }

    @PostMapping("/{id}")
    public ResponseEntity createBalance(@PathVariable UUID uuid,
                                        @RequestBody CurrentBalanceEntity currentBalanceEntity) {
        log.info("The createBalance");
        try {
            return ResponseEntity.ok().body(currentBalanceServiceImplementation.createBalance(currentBalanceEntity));
        } catch (BalanceNotFound exception) {
            return ResponseEntity.badRequest().body("The balance not found" + exception.getMessage());
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body("The balance not found" + exception.getMessage());
        }
    }
}
