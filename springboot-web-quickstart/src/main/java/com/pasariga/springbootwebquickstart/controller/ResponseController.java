package com.pasariga.springbootwebquickstart.controller;

import com.pasariga.springbootwebquickstart.pojo.Address;
import com.pasariga.springbootwebquickstart.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
    @RequestMapping("/getAddr")
    public Address getAddr(){
        Address address = new Address();
        address.setProvince("NY");
        address.setCity("NYC");
        System.out.println("address:"+address);
        return address;
    }
    @RequestMapping("/listAddr")
    public List<Address> listAddr(){
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("NY");
        address1.setCity("NYC");
        Address address2 = new Address();
        address2.setProvince("Washington");
        address2.setCity("Washington");
        list.add(address1);
        list.add(address2);
        System.out.println("list:"+list);
        return list;


    }*/
@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("hello");
        return new Result(1,"success","hello");
    }
    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address address = new Address();
        address.setProvince("NY");
        address.setCity("NYC");
        System.out.println("address:"+address);
        return Result.success(address);
    }
    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("NY");
        address1.setCity("NYC");
        Address address2 = new Address();
        address2.setProvince("Washington");
        address2.setCity("Washington");
        list.add(address1);
        list.add(address2);
        System.out.println("list:"+list);
        return Result.success(list);


    }

}
