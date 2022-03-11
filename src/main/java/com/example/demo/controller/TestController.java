package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    
    Logger logger = LoggerFactory.getLogger(TestController.class);

    private List<Test> tests;

    

    public TestController() {
        tests = new ArrayList<>();
        tests.add(Test.create("carmelo"));
    }


    @RequestMapping("/tests")
    @ResponseBody
    public List<Test> getTests() {
        return tests;
    }
    
}
