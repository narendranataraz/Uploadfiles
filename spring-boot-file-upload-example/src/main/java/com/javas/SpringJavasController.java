package com.javas;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javas.Customer;


@RestController
public class SpringJavasController {

    @PostMapping(path = "/save-cust-info")
    public String customerInformation(@RequestBody Customer cust) {

        /* You can write your DAO logic here.
         * For time being I am printing the customer data just to show the POST call is working.
         */

        return "Customer information saved successfully ::." + cust.getCustNo() + " " + cust.getName() + " " + cust.getCountry();
    }
}