package com.example.Tarea1.dto.response;

public class MetalsResponse {
    private Long id;

    private String nameM;
    private String weight;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameM() {
        return nameM;
    }

    public void setNameM(String nameN) {
        this.nameM = nameM;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
