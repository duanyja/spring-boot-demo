package com.example.demo.controller;

import com.example.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String show(Model model) throws Exception {
        List<User> users = new ArrayList<User>();
        users.add(new User(1L, "zhangsan"));
        users.add(new User(2L, "lisi"));
        users.add(new User(3L, "wangwu"));
        model.addAttribute("hello","我只是一个例子");
        model.addAttribute("users", users);
        model.addAttribute("addtime",new Date());
        return "helloHtml";
    }
}
