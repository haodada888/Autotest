package com.whh.testng.thread;

import org.testng.annotations.Test;

@Test(invocationCount = 10,threadPoolSize = 100)
public class ThreadTest {
    public void test(){

        System.out.println(1);
        System.out.printf("id:%s%n",Thread.currentThread().getId()) ;

    }
}

