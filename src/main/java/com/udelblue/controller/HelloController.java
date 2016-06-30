package com.udelblue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(HttpSession session) {
        Object atr = session.getAttribute("atr");
        if(atr != null) {
            return "Huray! " + atr.toString();
        } else {
            session.setAttribute("atr", "You made it!");
            return "Huray! Rerfresh page!";
        }
    }
    
    @RequestMapping("/test")
    public String test(HttpSession session) {
    	Object n = session.getAttribute("num");
    	  if(n != null) {
    		  int i = (int)n;
    		  i++;
    		  session.setAttribute("num", i);
              return "Number is " + Integer.toString(i);
          } else {
              session.setAttribute("num", 0);
              return "Number is  0";
          }
     
    }
    

}
