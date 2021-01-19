package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
  @ResponseBody
  @RequestMapping("hello")
    public  String test(){

      return  "helloword";
    }
    @RequestMapping("/test")
    public String test1(Map<Object,List<String >> map){

    map.put("list", Arrays.asList("张三","李四","王五"));
      return "test1";
    }

}
