package com.ani.training;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcController {

    @PostMapping("/create")
    public String createNewAccount() {
        /*
        * - account holder name
        * - account balance
        * */

        // saving data to database for creating account.

        return "";
    }
}
