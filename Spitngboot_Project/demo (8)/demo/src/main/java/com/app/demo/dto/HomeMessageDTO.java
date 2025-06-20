package com.app.demo.dto;


public class HomeMessageDTO {
    private String message;

    public HomeMessageDTO() {}

    public HomeMessageDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
