package com.ani.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ATMController {    // class

    @GetMapping("/balance")
    public Integer checkBalance() {    // function
        return 1000;
    }
}
