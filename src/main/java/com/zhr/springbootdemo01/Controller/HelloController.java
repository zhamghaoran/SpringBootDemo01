package com.zhr.springbootdemo01.Controller;

import com.zhr.springbootdemo01.Dao.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    person person;
    @RequestMapping("/person")
    public person person() {
        return person;
    }
}
