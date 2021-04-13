package com.ani.training;

import org.springframework.web.bind.annotation.*;

@RestController
public class ATMController {    // class

    private Integer amt = 0;

    @GetMapping("/balance")
    public Integer checkBalance() {    // function
        return amt;
    }

    @PostMapping("/deposit/{amount}")
    public String deposit(@PathVariable Integer amount) {
        amt = amt + amount;
        return  "Amount deposit successfully "+amount;
    }

    @DeleteMapping("/withdraw/{amount}")
    public String withdraw(@PathVariable Integer amount) {
        amt = amt - amount;
        return  "Amount withdraw successfully "+amount;
    }

    @PutMapping("/penalty")
    public String penalty() {
        amt = amt - 10;
        return "Penalty Applied";
    }
}
