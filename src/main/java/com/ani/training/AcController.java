package com.ani.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AcController {

    @Autowired
    private BankAccountDao dao;

    @PostMapping("/create/basic")
    public String createNewAccount() {
        BankAccount ac = new BankAccount();
        ac.setId(123);
        ac.setAcNm("Ani");
        ac.setBal(1234);

        dao.save(ac);

        return "Account Created Successfully";
    }

    @PostMapping("/create")
    public String createNewAccountFromObject(@RequestBody BankAccount ac) {
        dao.save(ac); // insert query
        return "Account Created Successfully";
    }

    @GetMapping("/accounts")
    public List<BankAccount> listAccount() {
        List<BankAccount> accounts = dao.findAll();
        return accounts;
    }
}
