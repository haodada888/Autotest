package com.whh.testng.parameter;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderTest {
@Test(dataProvider = "test")
    public void provider(String name,int age){
        System.out.println("name ="+ name + "; age ="+ age);


    }
@DataProvider(name="test")
    public Object [][] datapro(){
    Object [][] p=new Object[][]{
            {"zhangsan", 10},
            {"lisi", 30},


    };
    return p;

    }
    @Test(dataProvider = "methodtest")
    public void test1(String name,int age){
        System.out.println("name ="+ name + "; age ="+ age);


    }
    @Test(dataProvider = "methodtest")
    public void test2(String name,int age){
        System.out.println("name ="+ name + "; age ="+ age);

    }
@DataProvider(name = "methodtest")
    public Object[][] methodpro(Method method){

    Object[][] result= null;
    if (method.getName().equals("test1")) {
        result = new Object[][]{
            {"zhang",11},
            {"li",22}

        };
    } else if (method.getName().equals("test2")) {
        result = new Object[][]{
            {"wang",33},
            {"zhao",44}

        };
    }

  return result;
    }


}
