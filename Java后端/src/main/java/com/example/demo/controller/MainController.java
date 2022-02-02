package com.example.cpb.controller;
/*
  User: Yemao Luo
  Date: 2022/2/1
  Time: 11:48
*/

import com.example.demo.service.UrlService;
import com.example.demo.domain.url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

   @Autowired
   private UrlService urlService;

   @RequestMapping("/")
   public String goTo(){
      System.out.println("goto");
      url url = urlService.getById(1);
      String target = "redirect:" + url.getTunnel();
      return target;
   }
}
