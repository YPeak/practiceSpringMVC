package com;

import entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/26.
 */
@Controller
@RequestMapping("/C")
public class Practice2 {

    @RequestMapping("/C")
//    当页面请求中没有相应的参数时会报错(400)
    public String  testC(@RequestParam("xingming")String name, @RequestParam("mima")String pwd , Model model){

        Logger logger = Logger.getLogger(Practice2.class);
        logger.debug("这是debug");
        logger.info("这是info");
        logger.error("这是error");
        logger.fatal("这是fatal");

        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        model.addAttribute("user",user);
//        model.addAttribute("userName" ,name);
//        model.addAttribute("pwd",pwd);

        return  "testRequestC";
    }

}
