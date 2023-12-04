package ru.tinkoff.fintech.qa.api_models;
public class GetUserResponse{
    private int passportNumber;
    private Object phone;
    private int id;
    private String fio;
    private int passportSeries;

    public void setPassportNumber(int passportNumber){
        this.passportNumber = passportNumber;
    }

    public int getPassportNumber(){
        return passportNumber;
    }

    public void setPhone(Object phone){
        this.phone = phone;
    }

    public Object getPhone(){
        return phone;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setFio(String fio){
        this.fio = fio;
    }

    public String getFio(){
        return fio;
    }

    public void setPassportSeries(int passportSeries){
        this.passportSeries = passportSeries;
    }

    public int getPassportSeries(){
        return passportSeries;
    }
}
