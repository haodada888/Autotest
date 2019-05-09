package com.whh.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupClass2{
    public void test1(){
        System.out.println("222");
    }
}
