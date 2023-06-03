package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    private String userName;
   private  String password;
   @OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
   List<ServiceProvider> serviceproviderList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ServiceProvider> getServiceproviderList() {
        return serviceproviderList;
    }

    public void setServiceproviderList(List<ServiceProvider> serviceproviderList) {
        this.serviceproviderList = serviceproviderList;
    }

    public Admin() {
    }
}
