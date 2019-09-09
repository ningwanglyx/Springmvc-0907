package com.day0907.service;

import com.day0907.pojo.Country;

/**
 * @Author: YangxingLiu
 * @Description: Country接口，定义方法
 * @Date: Created in 2019/9/9 17:10
 * @Modified By:
 */
public interface CountryService {
    /**
     * @Author: YangxingLiu
     * @Description: 根据id来查找国家
     * @Date: Created in 17:11 2019/9/9
     * @Param id: 国家id
     * @return: com.day0907.pojo.Country
     **/
    public Country findCountryById(Integer id);
}
