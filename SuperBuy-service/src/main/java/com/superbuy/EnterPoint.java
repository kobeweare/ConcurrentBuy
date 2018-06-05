package com.superbuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Meli on 6/5/2018.
 */
@ComponentScan(value = {"com.superbuy.test"})
@EnableAutoConfiguration
public class EnterPoint {

    public static void main(String[] args) {
        SpringApplication.run(EnterPoint.class,args);
    }
}
