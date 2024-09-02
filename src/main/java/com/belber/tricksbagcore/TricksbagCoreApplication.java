package com.belber.tricksbagcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class TricksbagCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(TricksbagCoreApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World To Tricksbag";
    }
}
