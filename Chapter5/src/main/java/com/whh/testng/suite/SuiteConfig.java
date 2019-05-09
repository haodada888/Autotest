package com.whh.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforesuite() {
        System.out.println("1111111");

    }

    @AfterSuite
    public void aftersuite() {
        System.out.println("2");

    }

    @BeforeTest
    public void beforetest() {
        System.out.println("5");
    }

    @AfterTest
    public void aftertest() {
        System.out.println("6");
    }
}