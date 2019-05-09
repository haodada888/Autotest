package com.whh.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupClass1 {
    public void test1(){
        System.out.println("111");
    }
}
