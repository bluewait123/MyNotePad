package com.springboot.export.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Spring Boot 启动类
 * @author w
 */
@RestController
@SpringBootApplication
@ComponentScan(value = "com.springboot.*")
@EnableAutoConfiguration
@ServletComponentScan
//@EnableTransactionManagement
public class Application {

    @GetMapping("/")
    @ResponseBody
    public String defaultPage(HttpSession session) {
        session.setAttribute("uid", UUID.randomUUID());

        return session.getAttribute("uid").toString();
    }

    public static void main(String[] args) {
        // SpringApplication.run("classpath: /application-context.xml", args);
        SpringApplication.run(Application.class, args);
    }
}
