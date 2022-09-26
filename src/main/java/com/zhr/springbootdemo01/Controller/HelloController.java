package com.zhr.springbootdemo01.Controller;

import com.zhr.springbootdemo01.Dao.person;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    person person;

    //@RequestMapping(value = "/person",method = RequestMethod.GET)
    @GetMapping("/user")
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
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Map<String,String> test(
            @RequestHeader() Map<String ,String> map,  // 可以把请求头信息放在String中，但是必须是String,String类型的map
            @RequestParam("inter") List<String> inter  // 可以获取多个参数
            ) {
        for (var i : inter)
            System.out.println(i);
        return map;
    }
}

