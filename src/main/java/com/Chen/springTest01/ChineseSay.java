package com.Chen.springTest01;

public class ChineseSay implements Person.ISay {
    @Override
    public void say() {
        System.out.println("你好");
    }
}
