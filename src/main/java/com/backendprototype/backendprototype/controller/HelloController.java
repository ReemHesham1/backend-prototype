package com.backendprototype.backendprototype.controller;

import com.backendprototype.backendprototype.api.HelloRestApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloRestApi {


    @Override
    public String printHello() {
        return "Hello Test!!??";
    }
}
