package com.whh.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupClass3 {
    public void test1(){
        System.out.println("333");
    }
}
