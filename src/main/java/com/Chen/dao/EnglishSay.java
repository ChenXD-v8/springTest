package com.Chen.dao;

public class EnglishSay implements Person.ISay {
    @Override
    public void say() {
        System.out.println("Hello");
    }
}
