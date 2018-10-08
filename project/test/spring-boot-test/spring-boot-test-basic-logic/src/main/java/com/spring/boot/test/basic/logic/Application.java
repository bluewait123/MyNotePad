package com.spring.boot.test.basic.logic;

import lombok.extern.log4j.Log4j;
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
@Log4j
@RestController
@SpringBootApplication
@ComponentScan(value = "com.spring.boot.test.*")
@EnableAutoConfiguration
@ServletComponentScan
public class Application {

    @GetMapping("/")
    @ResponseBody
    public String defaultPage(HttpSession session) {
        session.setAttribute("uid", UUID.randomUUID());

        return session.getAttribute("uid").toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.debug("spring boot running success!!!");
    }
}
