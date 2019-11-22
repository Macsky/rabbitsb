package com.example.rabbitsb.controller;

import com.example.rabbitsb.rabbit.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rabbit")
public class RabbitSenderController {


    @Autowired
    private HelloSender helloSender;


    @RequestMapping("/sender")
    @ResponseBody
    public String sender() {
        helloSender.sender();
        return "ok";
    }



}
