package com.Chen.springTest01;

public class PointCut {
    private  String jobNumber;

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void beforeISay(){
        System.out.println("before<"+jobNumber+">");
    }
    public void afterISay(){
        System.out.println("after<"+jobNumber+">");
    }
}
