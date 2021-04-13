package com.ani.training;

import org.springframework.web.bind.annotation.*;
/*
*  - What is Rest ?
*  - What is Controller ?
*  - What is Rest Controller ?
*  - What is Get ?
*  - What is Put ?
*  - What is Post ?
*  - What is Delete ?
* */

@RestController
public class ATMController {    // class

    private Integer amt = 0;

    @GetMapping("/balance")
    public Integer checkBalance() {    // function
        return amt;
    }

    @PostMapping("/deposit/{amount}")
    public String deposit(@PathVariable Integer amount) {
        if (amount <= 0) {
//            return  "Invalid Amount";
            throw new InvalidAmountException();
        }
        amt = amt + amount;
        return  "Amount deposit successfully "+amount;
    }

    @DeleteMapping("/withdraw/{amount}")
    public String withdraw(@PathVariable Integer amount) {
        if (amount <= 0) {
            return  "Invalid Amount";
        }
        amt = amt - amount;
        return  "Amount withdraw successfully "+amount;
    }

    @PutMapping("/penalty")
    public String penalty() {
        amt = amt - 10;
        return "Penalty Applied";
    }
}
