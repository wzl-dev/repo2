package com.bttc.work.web.controller;

import com.bttc.work.web.UsersService.UsersService;
import com.bttc.work.web.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class UsersController {
  @Resource
    private UsersService usersServiceImpl;
    @RequestMapping("/select")
    public String sel(Map<String,List<Users>> map){
      List<Users> k= usersServiceImpl.sel();
     map.put("list",k);

      return "index";
    }
}
