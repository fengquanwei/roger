package com.fengquanwei.roger.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.fengquanwei.roger")
@EnableJpaRepositories("com.fengquanwei.roger")
@EntityScan("com.fengquanwei.roger")
public class RogerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RogerWebApplication.class, args);
    }
}
