package com.pasariga.springbootwebquickstart.pojo;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

public class Address {
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    @RequestMapping("/arrayParam")
    public String arrayParam(String [] hobby){
        System.out.println(Arrays.toString(hobby));
        return "success";

    }


}
