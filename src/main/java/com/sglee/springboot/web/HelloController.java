package com.sglee.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller JSON을 반환 @ResponseBody를 메소드마다 선언 안해도 됨.
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
