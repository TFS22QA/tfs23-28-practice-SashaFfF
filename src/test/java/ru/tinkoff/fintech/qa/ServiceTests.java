package ru.tinkoff.fintech.qa;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.tinkoff.fintech.qa.api_models.UserRequest;
import ru.tinkoff.fintech.qa.api_models.UserResponse;

public class ServiceTests {
    @Test
    public void UpdateTest(){
        UserRequest userRequest = new UserRequest();
        userRequest.setId(1);
        userRequest.setFio("FIO");
        userRequest.setPhone("000000000");
        userRequest.setPassportNumber(123456);
        userRequest.setPassportSeries(1234);

        UserResponse userResponse = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(userRequest)
                .post("http://localhost:8080/api/update")
                .as(UserResponse.class);
        Assertions.assertEquals("Done", userResponse.getValue(), "Check update");
    }

    public void CodeTest(){

    }
}
