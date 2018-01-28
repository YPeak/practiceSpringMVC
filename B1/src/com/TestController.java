package com;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/12/21.
 */
public class TestController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("11");
        ModelAndView mv = new ModelAndView();
        mv.addObject("tishixinxi","hello word!");
        mv.setViewName("WEB-INF/yemian/a.jsp");
        return mv;
    }
}
