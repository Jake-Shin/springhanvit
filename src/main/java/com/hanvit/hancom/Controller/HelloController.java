package com.hanvit.hancom.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.hanvit.hancom.Dto.User;
import com.hanvit.hancom.Service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
public class HelloController {

    private final UserService userService;
    
    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/user")
    @ResponseBody
    public HashMap<String, Object> selectUser() {
        HashMap<String, Object> map = new HashMap<>();
        List<User> aa = userService.getUserList();
        map.put("data", aa);
        return map;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Integer insertUser(User user) {
        User input = new User();
        input.setName(user.getName());
        input.setCompletionTime(user.getCompletionTime());

        System.out.println("name ::> " + user.getName());
        System.out.println("time ::> " + user.getCompletionTime());

        Integer cnt = userService.insertUserTime(input);
        return cnt;
    }
    
    
    
}
