package com.whh.extentreport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentReport1 {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void  test3(){
        Assert.assertEquals(2,3);
    }

    public void log(){
        Reporter.log("hahahahahahahahahaha");
        throw new RuntimeException("222222222");

    }
}