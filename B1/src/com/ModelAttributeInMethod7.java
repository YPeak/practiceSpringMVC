package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/1/2.
 */
@Controller
public class ModelAttributeInMethod7 {
//    @ModelAttribute(value = "name")
//    public String  test1(@RequestParam ("name")String name){
//        return name;
//    }

    @ModelAttribute
    public String  test1(String name ,Model model){
        model.addAttribute("name",name);
        System.out.print(name);
        return name;
    }
//    测试@modelAttribute在方法参数中的使用(和@RequestParm取值一样的用法)
    @RequestMapping("/modelAttributeInMethod")
    public String test2(@ModelAttribute("name")String name , Model model){
        return name;
    }
}
