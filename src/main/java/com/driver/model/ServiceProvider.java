package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @ManyToOne
    @JoinColumn
    Admin admin;
    @OneToMany(mappedBy = "serviceprovider",cascade =CascadeType.ALL )
    List<Connection> connectionList = new ArrayList<>();
     @ManyToMany(mappedBy = "serviceproviderList",cascade = CascadeType.ALL)
    List<User> userList = new ArrayList<>();

   @OneToMany(mappedBy = "serviceprovider",cascade = CascadeType.ALL)
    List<Country> countryList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public ServiceProvider() {
    }
}
