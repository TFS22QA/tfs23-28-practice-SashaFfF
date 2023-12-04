package ru.tinkoff.fintech.qa.api_models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse{

    @JsonProperty("value")
    private String value;

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}