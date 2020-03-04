package com.example;

import com.example.dao.UserDoMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(value = "com.example.dao")
public class InitializrdemoApplication {

    @Autowired
    private UserDoMapper userDoMapper;

    public String hellWord() {
//        UserDo userDo = userDoMapper.selectByPrimaryKey(1);
//        if (userDo == null) {
//            return "查找不到该信息";
//        } else {
//            return userDo.toString();
//        }
        return "index";
    }

    public static void main(String[] args) {

        System.out.println("Hello,World");
        SpringApplication.run(InitializrdemoApplication.class, args);
    }
}
