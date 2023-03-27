package com.example.bankaccount.resource;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/api/v1/accounts")
public class BankAccountResource {
    @GetMapping("/")
    public String openMainPage() {
        log.info("The main page was open");
        return "index";
    }

    @GetMapping("/login")
    public String viewLoginPage() {
        log.info("The login page was open");
        return "login";
    }
}



