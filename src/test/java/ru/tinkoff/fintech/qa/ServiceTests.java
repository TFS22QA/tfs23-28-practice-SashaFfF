package ru.tinkoff.fintech.qa;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.tinkoff.fintech.qa.api_models.GetUserResponse;
import ru.tinkoff.fintech.qa.api_models.UserRequest;
import ru.tinkoff.fintech.qa.api_models.UserResponse;

public class ServiceTests {
    @Test
    public void UpdateTest() {
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

    @Test
    public void UpdateStatusCodeTest() {
        UserRequest userRequest = new UserRequest();
        userRequest.setId(1);
        userRequest.setFio("FIO");
        userRequest.setPhone("000000000");
        userRequest.setPassportNumber(123456);
        userRequest.setPassportSeries(1234);
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(userRequest)
                .post("http://localhost:8080/api/update")
                .then()
                .statusCode(200);
    }

    @Test
    public void GetTest() {
        int ID = 1;
        GetUserResponse getUserResponse = RestAssured.get("http://localhost:8080/api/get/" + ID).as(GetUserResponse.class);
        Assertions.assertEquals("FIO", getUserResponse.getFio(), "Check FIO in get");

    }

    @Test
    public void addUserTest() {
        UserRequest userRequest = new UserRequest();
        userRequest.setId(3);
        userRequest.setFio("Ivanov");
        userRequest.setPhone("000000000");
        userRequest.setPassportNumber(123456);
        userRequest.setPassportSeries(1234);

        UserResponse userResponse = RestAssured.given()
                .body(userRequest)
                .contentType(ContentType.JSON)
                .post("http://localhost:8080/api/add")
                .as(UserResponse.class);
        Assertions.assertEquals("Done", userResponse.getValue());
    }

    @Test
    public void DeleteTest() {
        UserRequest userRequest = new UserRequest();
        userRequest.setId(1);
        userRequest.setFio("FIO");
        userRequest.setPhone("000000000");
        userRequest.setPassportNumber(123456);
        userRequest.setPassportSeries(1234);

        UserResponse userResponse = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(userRequest)
                .post("http://localhost:8080/api/delete/" + userRequest.getId())
                .as(UserResponse.class);
        Assertions.assertEquals("Done", userResponse.getValue(), "Check delete");
    }

    @Test
    public void DeleteTestCode() {
        UserRequest userRequest = new UserRequest();
        userRequest.setId(1);
        userRequest.setFio("FIO");
        userRequest.setPhone("000000000");
        userRequest.setPassportNumber(123456);
        userRequest.setPassportSeries(1234);

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(userRequest)
                .post("http://localhost:8080/api/delete/" + userRequest.getId())
                .then().statusCode(200);
    }
}
