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

        Integer cnt = userService.insertUserTime(input);
        return cnt;
    }
    
    @RequestMapping("/completion")
    @ResponseBody
    public Integer selectCompletionCountByUser(User user) {
    	User input = new User();
    	input.setName("신현진");
        //input.setName(user.getName());
        
        Integer completionCount = userService.selectCompletionCountByUser(input);
        return completionCount;
    }
    
    @RequestMapping("/checkName")
    @ResponseBody
    public Integer selectCheckName(User user) {
    	user.setName("신현진");
    	Integer checkNameCnt = userService.selectCheckName(user);
    	return checkNameCnt;
    }
    
    
    
}
