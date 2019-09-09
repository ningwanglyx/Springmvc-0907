package com.day0907.mapper;

import com.day0907.pojo.Country;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CountryMapper {
    public Country findCountryById(Integer id);

    public List<Country> findAllCountry();

    public List<Country> findCountryByName(String name);

    public int addCountry(Country country);
 }
