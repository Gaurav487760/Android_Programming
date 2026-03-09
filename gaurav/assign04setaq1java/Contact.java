package com.example.assign04setaq1java;

public class Contact {
    private String name, contactNumber, email;
    private int photo;
    public Contact(String name, String contactNumber, String email, int
            photo) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.photo = photo;
    }
    public String getName() {
        return name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoto() {
        return photo;
    }
}