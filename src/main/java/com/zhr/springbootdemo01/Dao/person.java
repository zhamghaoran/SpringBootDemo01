package com.zhr.springbootdemo01.Dao;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;


@ConfigurationProperties(prefix = "person")
@Component
@Data  // get set方法
@ToString // tostring方法
@AllArgsConstructor // 全参构造器0
@NoArgsConstructor // 无参构造器
@EqualsAndHashCode
public class person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}
