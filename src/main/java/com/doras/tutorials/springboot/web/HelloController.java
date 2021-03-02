package com.doras.tutorials.springboot.web;

import com.doras.tutorials.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloweb")
    public String hello() {
        return "hello web service";
    }


    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount)
    {
        return new HelloResponseDto(name, amount);
    }
}
