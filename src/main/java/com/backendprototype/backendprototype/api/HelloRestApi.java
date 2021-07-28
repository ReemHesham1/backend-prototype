package com.backendprototype.backendprototype.api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping(value = "/api/hello")
public interface HelloRestApi {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    String printHello ();

}
