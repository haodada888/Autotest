package com.whh.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = "g1")
    public void group1(){
        System.out.println("1");
    }
    @Test(groups ="g1")
    public void group11(){
        System.out.println("111");
    }
    @Test(groups = "g2")
    public void group2(){
        System.out.println("2");
    }
    @Test(groups = "g2")
    public void group22(){
        System.out.println("222");
    }
    @BeforeGroups("g1")
    public void beforegroup(){
        System.out.println("before");
    }
    @AfterGroups("g2")
    public void aftergroup(){
        System.out.println("after");
    }
}
