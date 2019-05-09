package com.whh.testng.parameter;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param1 {
    @Test
    @Parameters({"name","age"})
    public void test1(String a,int b){
        String name=a;
        int age=b;
        System.out.println("name="+ name +";age=" + age);
    }
}
