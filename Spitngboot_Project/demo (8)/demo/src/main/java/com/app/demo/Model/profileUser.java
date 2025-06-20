package com.app.demo.Model;
public class profileUser {
    private String name;
    private String email;
    private String phone;
    private String accountId;
    private String ifsc;

    public profileUser(String name, String email, String phone, String accountId, String ifsc) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.accountId = accountId;
        this.ifsc = ifsc;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAccountId() { return accountId; }
    public String getIfsc() { return ifsc; }

}
