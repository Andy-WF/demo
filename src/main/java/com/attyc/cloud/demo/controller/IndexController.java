package com.attyc.cloud.demo.controller;

import com.attyc.cloud.demo.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WF on 2018/5/26.
 */

@Controller
public class IndexController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        User user = new User();
        user.setName("zhangwuji");
        System.out.println(user);
        return "index";
    }


}
