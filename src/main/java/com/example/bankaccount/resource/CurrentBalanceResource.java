package com.example.bankaccount.resource;

import com.example.bankaccount.service.CurrentBalanceServiceImplementation;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RequestMapping("/api/v1/balance")
@Log4j2
@Data
public class CurrentBalanceResource {
    private final CurrentBalanceServiceImplementation currentBalanceServiceImplementation;

    @GetMapping("/{id}/all")
    public ResponseEntity getHandleAllBalance(@PathVariable UUID uuid) {
        log.info("The main page was open");
        try {
            return ResponseEntity.ok().body(currentBalanceServiceImplementation.getHandleAllBalance(uuid));
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body("Exception" + exception.getMessage());
        }
    }
}
