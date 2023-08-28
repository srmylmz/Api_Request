package post_request;

import io.restassured.response.Response;
import base_url.PetStoreBaseUrl;
import pojos.PetPojo;
import pojos.ResponsePojo;
import test_data.PetStoreData;
import org.junit.Test;
import utilities.ObjectMapperUtils;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Post01 extends PetStoreBaseUrl {
    @Test
    public void post01()  {
    /*
   "https://petstore.swagger.io/"
    dökümanını kullanarak 'user' oluşturacak bir otomasyon testi yazınız
    Not: Test Case'i gherkin language ile yazınız.
    Base URL: petstore.swagger.io/v2 post işlemi yapalım */
    /*

     Given https://petstore.swagger.io/v2/user
      {
       "id": 0,
       "username": "100NumaralıAdam",
       "firstName": "Kemal",
       "lastName": "Sunal",
       "email": "kemal_sunal@gmail.com",
       "password": "K100",
       "phone": "05551001010",
       "userStatus": 100
                             }
      When I send POST Request to the Url
      Then Status code is 200
      And response body is like;
                          /* {
    "code": 200,
    "type": "unknown",
    "message": "9223372036854756769"
}*/


  spec.pathParam("first","user");

  PetPojo payLoad=new PetPojo("100NumaralıAdam","Kemal","Sunal",
          "kemal_sunal@gmail.com","K100","05551001010",100);

  Response response=given(spec).body(payLoad).when().post("{first}");

  ResponsePojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(),ResponsePojo.class);

  assertEquals("Jetty(9.2.9.v20150224)",response.header("Server"));
  assertEquals("application/json",response.contentType());
  assertEquals(200,actualData.getCode());
  assertEquals("unknown",actualData.getType());


    }

    @Test
    public void post02() {
                                      //2.Way
        spec.pathParam("first","user");

        Map<String,Object> payLoad=new PetStoreData().petStoreDataMapper("100NumaralıAdam","Kemal",
                                                                        "Sunal","kemal_sunal@gmail.com",
                                                                    "K100","05551001010",100);


        Response response=given(spec).body(payLoad).when().post("{first}");

        Map<String,Object> actualData=response.as(HashMap.class);


        assertEquals("Jetty(9.2.9.v20150224)",response.header("Server"));
        assertEquals("application/json",response.contentType());
        assertEquals("unknown",actualData.get("type"));
        assertEquals(200,actualData.get("code"));


    }
}
