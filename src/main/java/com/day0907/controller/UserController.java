package com.day0907.controller;

import com.day0907.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/11 18:36
 * @Modified By:
 */
@Controller
@RequestMapping("user")
public class UserController {
    //默认参数类型绑定request，response，session，model
    @RequestMapping("/test.action")
    public String testCotroller(HttpServletRequest request){
        //返回get方式
        System.out.println(request.getMethod());
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        return "success";
    }
    /**
     * @Author: YangxingLiu
     * @Description: 简单参数类型绑定，int，String；前端请求参数名和后端控制器方法中的形参名不一致，使用@RequestParam注解
     * @Date: Created in 21:29 2019/9/11
     * @Param session:
     * @return: java.lang.String
     **/
    @RequestMapping("/test2.action")
    //间接参数绑定
    public String testController2(@RequestParam("userid") Integer id){
        Integer ids = id;
        System.out.println("id = " + ids);
        return "success";
    }

    @RequestMapping("/toRegister/action")
    public String toResgister(){
        return "register";
    }

    public String registerUser(Book book){

        return "success";
    }

    @RequestMapping("hello.action")
    public String helloUser(){
        return "role";
    }



}
