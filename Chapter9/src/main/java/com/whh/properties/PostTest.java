package com.whh.properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class PostTest {
    String url;
    ResourceBundle bundle;
    private CookieStore store;

    @BeforeTest
    public void test1(){
        bundle=ResourceBundle.getBundle("applicat", Locale.CHINA);
        url=bundle.getString("test.url");
    }

    @Test
    public void test2() throws IOException {

        String result;
        String uri=bundle.getString("test.uri");
        String all=url+uri;
        HttpGet get=new HttpGet(all);
        HttpClient client=new DefaultHttpClient();
        HttpResponse response=client.execute(get);
        result= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);


        CookieStore store=((DefaultHttpClient) client).getCookieStore();
        List<Cookie> cookieList=store.getCookies();
        for(Cookie cookie:cookieList){
            String name=cookie.getName();
            String value=cookie.getValue();
            System.out.println(name+value);
        }




    }
    @Test(dependsOnMethods = {"test2"})
    public void test3() throws IOException {
        String uri=this.bundle.getString("post.cookies");
        String all=this.url+uri;


        HttpPost post=new HttpPost(all);
        DefaultHttpClient client=new DefaultHttpClient();

        JSONObject param=new JSONObject();
        param.put("name","wang");
        param.put("age","20");

        post.setHeader("content-type","application/json");
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);

        String result;
        client.setCookieStore(this.store);

        HttpResponse response=client.execute(post);
        result= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

        JSONObject resultjson=new JSONObject(result);

        String success= (String) resultjson.get("wang");

        Assert.assertEquals("success",success);

    }
}
