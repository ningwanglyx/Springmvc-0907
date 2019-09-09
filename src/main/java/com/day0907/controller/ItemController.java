package com.day0907.controller;

import com.day0907.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/8 22:13
 * @Modified By:
 */
@Controller
public class ItemController {
    @RequestMapping("/itemList.action")
    public ModelAndView queryItemList(){
        List<Item> list = new ArrayList<Item>();
        list.add(new Item(1, "1华为 荣耀8", (float) 2399, new Date(), "质量好！1"));
        list.add(new Item(2, "2华为 荣耀8", (float) 2399, new Date(), "质量好！2"));
        list.add(new Item(3, "3华为 荣耀8", (float) 2399, new Date(), "质量好！3"));
        list.add(new Item(4, "4华为 荣耀8", (float) 2399, new Date(), "质量好！4"));
        list.add(new Item(5, "5华为 荣耀8", (float) 2399, new Date(), "质量好！5"));
        list.add(new Item(6, "6华为 荣耀8", (float) 2399, new Date(), "质量好！6"));
        //创建mav对象，用来存放数据和视图
        ModelAndView mav = new ModelAndView();
        //把数据放入视图中
        mav.addObject("itemList", list);
        //设置视图的物理地址
        mav.setViewName("itemList");
        return mav;

    }
}
