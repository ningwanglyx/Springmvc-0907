package com.day0907.pojo;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/11 23:28
 * @Modified By:
 */
public class User {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
