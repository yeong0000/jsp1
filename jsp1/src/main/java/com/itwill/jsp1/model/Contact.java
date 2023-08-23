package com.itwill.jsp1.model;

public class Contact {
    private int id;
    private String name;
    private String phone;
    private String email;
    
    public Contact() {}

    public Contact(int id, String name, String phone, String email) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
    }
    
}
