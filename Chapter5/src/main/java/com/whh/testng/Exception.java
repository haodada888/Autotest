package com.whh.testng;

import org.testng.annotations.Test;

@Test(expectedExceptions = RuntimeException.class)
public class Exception {
    public void test1() {
        System.out.println("baocuole");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void test2() {


        System.out.println("bubaocuole");
        throw new RuntimeException();
    }
}

