package com.ex.demo.controller;


import com.ex.demo.dto.DemoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/demo1")
    public String demo1(){
        return "demo1";
    }

    @PostMapping("/demo2")
    public String demo2(@RequestParam("param1") String param1, @RequestParam("param2") String param2){
        System.out.println("submit = " + param1 + " " + param2);
        //DemoDTO demoDTO = new DemoDTO();
        return "index";
    }

    @PostMapping("/demo3")
        public String demo3(@ModelAttribute DemoDTO demoDTO){
            System.out.println("demoDTO = " + demoDTO);
            return "index";
        }






}
