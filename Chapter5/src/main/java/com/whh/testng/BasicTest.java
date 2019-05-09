package com.whh.testng;

import org.testng.annotations.*;

public class BasicTest {
    @Test
    public void test1(){
        System.out.println("111");
        System.out.printf("id:%s%n", Thread.currentThread().getId());

    }
    @BeforeMethod
public void test2(){
        System.out.println("222");
        System.out.printf("id:%s%n", Thread.currentThread().getId());
}
@AfterMethod
public void test3(){
System.out.println("333");
    System.out.printf("id:%s%n", Thread.currentThread().getId());
}

@Test
    public void test4(){
        System.out.println("444");
}

@BeforeClass
    public void test5(){System.out.println("555");}

    @AfterClass
    public void test6(){System.out.println("666");}
}

