package com.day0907.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: YangxingLiu
 * @Description: 控制器类演示案例
 * @Date: Created in 2019/9/9 15:21
 * @Modified By:
 */
@Controller
public class FirstController {
    /**
     * @Author: YangxingLiu
     * @Description: 使用mav作为传递参数，mav可以携带数据和指定视图，不能实现数据和视图之间的解耦合
     * @Date: Created in 16:41 2019/9/9
     * @return: org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping("/first.action")
    public ModelAndView handleRequest(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "我的第一个springmvc程序");
        mav.setViewName("first");
        return mav;
    }
    /**
     * @Author: YangxingLiu
     * @Description: 使用Model类型参数和String返回值实现ModelAndView的功能
     * @Date: Created in 16:46 2019/9/9
     * @Param model:
     * @return: java.lang.String
     **/
    @RequestMapping("/second.action")
    public String handleRequest(Model model){
        model.addAttribute("msg", "我的第二个springmvc项目");
        return "first";
    }
}
