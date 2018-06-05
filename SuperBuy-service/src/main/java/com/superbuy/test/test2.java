package com.superbuy.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Meli on 6/5/2018.
 */
@RestController
public class test2 {
    @RequestMapping("/")
    public String World() {
        return "world";
    }
}
