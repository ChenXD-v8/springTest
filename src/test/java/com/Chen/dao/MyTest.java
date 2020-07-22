package com.Chen.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //Person使用ChineseSay实现类
    @Test
    public void testChineseSay(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person.ISay  chineseSay = context.getBean("chineseSay", Person.ISay.class);
        chineseSay.say();
    }
    //Person使用EnglishSay实现类
    @Test
    public void testEnglishSay(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person.ISay  englishSay = context.getBean("englishSay", Person.ISay.class);
        englishSay.say();
    }
}
