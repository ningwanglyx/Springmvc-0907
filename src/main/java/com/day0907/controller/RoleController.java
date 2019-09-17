package com.day0907.controller;

import com.day0907.pojo.Role;
import com.day0907.pojo.RoleParams;
import com.day0907.service.RoleService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/16 22:14
 * @Modified By:
 */
@Controller
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    //重定向到role.jsp
    @RequestMapping("hello.action")
    public String helloUser(){
        return "role";
    }

    //1 传递普通请求参数
    @RequestMapping("add.action")
    @ResponseBody
    public String addUser(String roleName, String note){
        System.out.println("roleName: " + roleName);
        System.out.println("note: " + note);
        return "OK";
    }

    //2 传递pojo类型请求参数
    @RequestMapping("addpojo.action")
    @ResponseBody
    public String addRolePojo(Role role){
        System.out.println(role);
        System.out.println("roleName: "+ role.getRoleName());
        System.out.println("note: " + role.getNote());
        return "OK";
    }

    //3 前后端参数名称不一致，使用@RequestParam注解获取参数
    @RequestMapping("add2.action")
    @ResponseBody
    public String addRoleDif(@RequestParam(value = "role_name", required = false) String roleName, @RequestParam(value = "NOTE", required = false) String note){
        System.out.println("roleName: " + roleName);
        System.out.println("note: " + note);
        return "OK";
    }

    //4 RESTFul风格，使用URL传递参数
    //注解@PathVariable表示从URL请求地址中获取参数
    @RequestMapping("add3/{id}")
    public ModelAndView addVaRiable(@PathVariable("id") Integer id){
        Role role = roleService.queryRoleById(id);
        System.out.println(role);
        ModelAndView mav = new ModelAndView();
        mav.addObject(role);
        //设置为json视图
        mav.setView(new MappingJackson2JsonView());
        return mav;
    }

    //5 传递JSON参数
    @RequestMapping("findRoles")
    public ModelAndView findRoles(@RequestBody RoleParams roleParams){
        return null;
    }

}
