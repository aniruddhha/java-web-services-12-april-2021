package com.ani.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ATMController {    // class

    private Integer amt = 0;

    @GetMapping("/balance")
    public Integer checkBalance() {    // function
        return amt;
    }

    @PostMapping("/deposit/{amount}")
    public String deposit(@PathVariable Integer amount) {
        amt = amount;
        return  "Amount deposit successfully";
    }
}
