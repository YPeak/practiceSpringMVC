package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/27.
 */
@Controller
@RequestMapping("medolAttribute")
public class TestModelAttribute5 {

    @RequestMapping("testModelAttribute")
    public String testM(){
        System.out.print("测试idea修改提交");
        return "testModelAttribute";
    }

}
