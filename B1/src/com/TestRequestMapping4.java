package com;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/12/22.
 */

@Controller
@RequestMapping(value = "/B")//,命名空间
public class TestRequestMapping4 {

@RequestMapping(value = "/testR")
public ModelAndView test(){
    System.out.println("22");
    ModelAndView m = new ModelAndView();
    m.setViewName("WEB-INF/page/testRequest.jsp");
    return m;
//    应为用了注解所以还是会在字符串前后加前缀拼接到一起找相应的jsp
}
    @RequestMapping(value = "/testZ")
    ModelAndView test1(){
        System.out.println("3333");
        ModelAndView m = new ModelAndView();
        m.setViewName("testRequestZ");
        return m;
    }

    @RequestMapping(value = "/testY" ,method = RequestMethod.GET)//网页的http请求默认为GET请求
    String test3(Model model){
        System.out.println("4444");
        model.addAttribute("ce","测试注解的使用");
        return "testRequestY";
    }

    @RequestMapping(value = "/testA",method = RequestMethod.GET)//服务方法名
//    @RequestMapping(name = "/bieming")错误
    String test4(){
//        System.out.println("5555");
//        model.addAttribute("zhenshi","实用方法");
            return "testRequestA";
    }


    @ModelAttribute //修饰符先于处理方法调用,可以先向Medol中添加数据(前台怎样传数据以这种方式接收数据
                    // 已验证:http://localhost:8080/B1/B/testB?userName=111&pw d=222)
                    //注:拼的参数名要和形参一致
    public void userModel(String userName , String pwd , Model model){
        User user = new User();
        user.setName(userName);
        user.setPwd(pwd);
        model.addAttribute("user",user);

    }
    @RequestMapping(value = "/testB",method = RequestMethod.GET)//服务方法名
    String test5(Model model){
        User user =(User) model.asMap().get("user");
        String  name  = user.getName();
        System.out.print(name);
        return "testRequestB";
    }


}
