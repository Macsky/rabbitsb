package com.example.rabbitsb.controller;

import com.example.rabbitsb.rabbit.FanoutSender;
import com.example.rabbitsb.rabbit.HelloSender;
import com.example.rabbitsb.rabbit.MsgSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rabbit")
public class RabbitSenderController {


    @Autowired
    private HelloSender helloSender;


    @Autowired
    private FanoutSender fanoutSender;


    @Autowired
    private MsgSender msgSender;


    @RequestMapping("/sender")
    @ResponseBody
    public String sender() {
        try {
            helloSender.sender();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/fanoutsend")
    public String fanoutSend() {
        fanoutSender.send();
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/msg")
    public String msgSender(){

        msgSender.sender1();
        msgSender.sender2();
        return "ok";
    }

}
