package com.zhr.springbootdemo01.Controller;

import com.zhr.springbootdemo01.Dao.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    person person;

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public person getPerson() {
        return person;
    }
    @RequestMapping(value = "/person" ,method = RequestMethod.PUT)
    public person PutPerson(person person1) {
        return person1;
    }
    @RequestMapping(value = "/person",method = RequestMethod.POST)
    public person PostPerson(String username,Integer age) {
        person.setAge(age);
        person.setUserName(username);
        return person;
    }


}

