package com.project.demo.controller;

import com.project.demo.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCall {
    @Autowired
    RestService restService;

//    public RestCall(RestService service,RestService restService){
//        this.restService =service;

//    }

    @GetMapping("callTask")
    public  void callAPi(){
        restService.getCall();
    }


}
