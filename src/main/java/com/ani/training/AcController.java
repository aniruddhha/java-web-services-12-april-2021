package com.ani.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        ac.setVer("1.1.3");

        dao.save(ac);

        return "Account Created Successfully";
    }

    @PostMapping("/create")
    public String createNewAccountFromObject(@RequestBody BankAccount ac) {
        ac.setVer("1.1.3");
        dao.save(ac); // insert query
        return "Account Created Successfully";
    }

    @GetMapping("/accounts")
    public List<BankAccount> listAccount() {
        List<BankAccount> accounts = dao.findAll();
        return accounts;
    }

    @PutMapping("/update/{id}/{bal}")
    public String updateBalance(@PathVariable Integer id, @PathVariable Integer bal) {
        BankAccount ac = dao.findById(id).get(); // select * from accout where id = 321
        ac.setBal(bal);
        dao.save(ac);
        return  "Balance Updated Successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAccount(@PathVariable Integer id) {
        BankAccount ac = dao.findById(id).get();
        dao.delete(ac);

        return  "Bank Account Deleted Successfully";
    }
}
