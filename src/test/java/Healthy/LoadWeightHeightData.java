package Healthy;

import Base.BaseTest;
import com.google.gson.Gson;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoadWeightHeightData extends BaseTest {

    @Test
    public void AddWeightHeightData(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("date","2018-07-12T00:00:00.000");
        map.put("weight","50");
        map.put("heightMajor","1");
        map.put("heightMinor","50");
        map.put("headSize","30");
        map.put("unit",2);
        map.put("lang",0);

        Response response= given().log().all().
                spec(requestSpecification).
                when().
                    body(new Gson().toJson(map)).
                    post("/api/PatientHealth/AddWeightHeightData").
                then().
                    log().body().statusCode(200).extract().response();
    }

    @Test(enabled = true)
    public void loadWeightHeightData(){

        Response response= given().log().all().
                spec(requestSpecification).
                when().param("unit",2).
                param("lang", 1).
                post("api/PatientHealth/LoadWeightHeightData").
                then().log().body().statusCode(200).extract().response();
    }
}
