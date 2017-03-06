/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodpoints.e2e;

import static com.jayway.restassured.RestAssured.given;
import com.jayway.restassured.http.ContentType;
import static com.jayway.restassured.http.ContentType.JSON;
import com.jayway.restassured.response.Response;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static org.hamcrest.CoreMatchers.equalTo;
import org.json.simple.JSONObject;
import org.junit.Test;



/**
 *
 * @author Kolade
 */
public class FirstTest {
    
     @Test
    public void createRestaurant() {
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sp = new SimpleDateFormat("YYYY-MM-dd");
        JSONObject o = new JSONObject();

        o.put("name", "Farinto Folarin");
        o.put("address", "Number 16, Farinto Avenue, Bodija Estate");
        o.put("contactNumber", "08054483889");
        o.put("upperLimit", 15000.00);
        o.put("lowerLimit", 350.00);
        o.put("description", "A restaurant with a whole lot of class");
        o.put("tags", "Amala, Efo");
        o.put("recommendation", 5);
        o.put("likes", "40");
        o.put("ratings", 34.9);
        System.out.println("the value being passed " + o.toJSONString());
       // given().contentType(JSON).pathParam("customer_id", 1).body(o.toJSONString()).when().post("http://localhost:9080/bss/v1/provision/customers/{customer_id}/contracts/prepaid").then().statusCode(200);
     Response resp;
         resp = given().
                 contentType(JSON).
                 body(o.toJSONString()).
                 when().
                 post("http://localhost:8080/FoodPoints/myfoodzone/v1/create/restaurants").
                 then().
                 //body("message", equalTo("Successfully created!")).
                 contentType(ContentType.JSON).extract().response();
         String r = resp.asString();
         System.out.println(r);
    }
    
    
     public static void main(String[] args) {

        FirstTest op = new FirstTest();
        op.rullAll();
    }

    void rullAll() {
     createRestaurant();      
    }

    
}
