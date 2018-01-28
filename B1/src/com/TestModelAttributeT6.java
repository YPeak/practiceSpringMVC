package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/27.
 */
@Controller
@RequestMapping("medolAttribute/T")
public class TestModelAttributeT6 {

    @ModelAttribute(value = "name1")
    public String TT(@RequestParam("name")String name){
        return name;
    }

    @RequestMapping(value = "TTT",method = RequestMethod.POST)
    public String testM( ){
        System.out.print("1111");
        return "testModelAttributeResult";
    }

    //特殊重点
    @ModelAttribute(value = "userName")
    @RequestMapping(value = "YYY",method = RequestMethod.POST)
    public String testY( ){
        System.out.print("1111");
        return "testModelAttributeResult";
    }
}
