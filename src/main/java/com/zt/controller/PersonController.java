package com.zt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: payment
 * @description:
 * @author: zhou.wei
 * @create: 2018-05-24 11:02
 **/
@RestController
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("referPerson")
    public String  referPerson(){
        System.out.println("i  am  jackSon   ");
        return "success";
    }

}
