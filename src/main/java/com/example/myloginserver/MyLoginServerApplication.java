package com.example.myloginserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) //현재는 데베 사용안함
public class MyLoginServerApplication {

    @RequestMapping("/")
    String TestController(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyLoginServerApplication.class, args);
    }

}
