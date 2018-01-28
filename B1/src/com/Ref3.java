package com;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
@Controller
@RequestMapping("/login")
public class Ref3 {

    private static List<User> userList = new ArrayList<User>();
    User user = new User();

//    public Ref(){
//        super();
//        userList = new ArrayList<User>();
//    }

    @RequestMapping(value = "/registerFrom")
    public String register(){
        return "reg";
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String login(@RequestParam("name") String name , @RequestParam("pwd") String pwd ){
//        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
//        user.add(user);
//        userList.add(user);
        return "login";
    }

    @RequestMapping(value = "login")
    public String welcom(@RequestParam("name")String name , @RequestParam("pwd")String pwd , Model model){
        if(user.getName().equals(name) && user.getPwd().equals(pwd)){
            model.addAttribute("name",name); //添加前台页面需要展示的数据
            return "welcom";
        }
        return "sorry";
    }

}
