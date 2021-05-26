package com.company.Client;

public class DefaultClient  extends Client{

    private String age;
    private String phone;


    public DefaultClient(String name, String surname, String address) {
        super(name, surname, address);
    }

    public DefaultClient() {
    }

    public DefaultClient(String name, String surname, String address, String age, String phone) {
        super(name, surname, address);
        this.age = age;
        this.phone = phone;
    }

    public DefaultClient(String age, String phone) {
        this.age = age;
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
