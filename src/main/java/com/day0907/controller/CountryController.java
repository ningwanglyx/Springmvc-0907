package com.day0907.controller;

import com.day0907.pojo.Country;
import com.day0907.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: YangxingLiu
 * @Description: Country的控制器类
 * @Date: Created in 2019/9/9 17:21
 * @Modified By:
 */
@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;

    @RequestMapping("/findCountryById.action")
    public String findContryById(Integer id, Model model){
        Country country = this.countryService.findCountryById(id);
        model.addAttribute("country", country);
        return "country";
    }
}
