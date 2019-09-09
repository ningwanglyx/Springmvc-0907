package com.day0907.service;


import com.day0907.mapper.CountryMapper;
import com.day0907.pojo.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/9 17:12
 * @Modified By:
 */
@Service
@Transactional
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryMapper countryMapper;
    @Override
    public Country findCountryById(Integer id) {
        return this.countryMapper.findCountryById(id);
    }
}
