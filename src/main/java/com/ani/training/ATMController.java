package com.ani.training;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
/*
   - What is web service ? One software is calling method of another software, this mechanism is referred as web service.
   - What is http ? -> Hypertext Transfer Protocol. Generally Web Services Communicate over the http protocol.
   - What are data exchange formats ? -> Web Service transmits or receives data in predefined format, this format has to be accepted by clients for communication. HTML, XML , JSON etc etc are the mostly used data exchange formats.
*  - What is Rest ? -> REST is a guideline. It says concepts like Resource (Anything that performs predefined action and which
*    can be accessed by URL),Collection and URL (Uniform Resource Locator)
*  - What is Controller ? -> Is main part of your application which communicates with user.
*  - What is Rest Controller ? -> it is the controller which follows REST Guidelines.
*  - What is Get ? -> getting resource from server
*  - What is Put ? -> putting/updating resource on the server
*  - What is Post ? -> saving resource on the server
*  - What is Delete ? -> deleting resource from server
   - What is jar ? -> it is a bundle of final build, Java Archive file
   - what is apache-tomcat ? -> apache is web server, tomcat is servlet container. Tomcat runs spring application and apache serves it over http.
* * */

@CrossOrigin
@RestController
public class ATMController {    // class

    @Autowired
    private MessageSource messageSource;

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
            //return  "Invalid Amount";
            throw new InvalidAmountException();
        }
        amt = amt - amount;
        return  "Amount withdraw successfully "+amount;
    }

    @PutMapping("/penalty")
    @ApiOperation(value = "This service will help you to apply penalty")
    @ApiResponse(message = "Penalty Applied Sucessfully", code = 200)
    public String penalty() {
        amt = amt - 10;
        return "Penalty Applied";
    }

    @GetMapping("/msg")
    public String intMsg(@RequestHeader(name="Accept-Language", required=false)Locale locale) {
        return messageSource.getMessage("good.morning.message", null, locale);
    }

    @ExceptionHandler({ InvalidAmountException.class })
    public String handleException(Exception e) {
        return e.getMessage();
    }
}
