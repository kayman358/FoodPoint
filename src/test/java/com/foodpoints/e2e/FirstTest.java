///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.foodpoints.e2e;
//
//
//import static com.jayway.restassured.RestAssured.given;
//import com.jayway.restassured.http.ContentType;
//import static com.jayway.restassured.http.ContentType.JSON;
//import com.jayway.restassured.response.Response;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import static org.hamcrest.CoreMatchers.equalTo;
//import org.json.simple.JSONObject;
//import org.junit.Test;
///**
// *
// * @author Kolade
// */
//public class FirstTest {
//    
//     @Test
//    public void createPrepaidContract() {
//        Date d = Calendar.getInstance().getTime();
//        SimpleDateFormat sp = new SimpleDateFormat("YYYY-MM-dd");
//        JSONObject o = new JSONObject();
//
//        o.put("servicePrepaid", 222);
//        o.put("customerId", 273);
//        o.put("statusDate", sp.format(d));
//        o.put("startDate", sp.format(d));
//        o.put("content", "This is the content of the contract we just created for a TELOOperator with customer id 273");
//        o.put("automaticRenewal", false);
//        o.put("serviceType", "TELOOPERATOR");
//
//        //System.out.println("the value being passed " + o.toJSONString());
//       // given().contentType(JSON).pathParam("customer_id", 1).body(o.toJSONString()).when().post("http://localhost:9080/bss/v1/provision/customers/{customer_id}/contracts/prepaid").then().statusCode(200);
//     Response resp =   given().
//                contentType(JSON).
//                body(o.toJSONString()).
//                pathParam("customer_id", 273).
//                when().
//                post("http://localhost:9080/bss/v1/provision/customers/{customer_id}/prepaid-contracts").
//                then().
//               //body("message", equalTo("Successfully created!")).
//                contentType(ContentType.JSON).extract().response();
//         String r = resp.asString();
//         System.out.println(r);
//    }
//
//    
//}
