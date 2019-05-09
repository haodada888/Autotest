package com.whh.testng.thread;

import org.testng.annotations.Test;


public class MultiThread {
@Test
    public void test1() {
        System.out.printf("id:%s%n", Thread.currentThread().getId());
    }
@Test
    public void test2() {
        System.out.printf("id:%s%n", Thread.currentThread().getId());
    }
@Test
    public void test3() {
        System.out.printf("id:%s%n", Thread.currentThread().getId());
    }
}
