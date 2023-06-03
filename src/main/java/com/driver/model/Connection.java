package com.driver.model;

import javax.persistence.*;

@Entity
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    @ManyToOne
    @JoinColumn
   private ServiceProvider serviceprovider;
   @ManyToOne
   @JoinColumn
   private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceProvider getServiceprovider() {
        return serviceprovider;
    }

    public void setServiceprovider(ServiceProvider serviceprovider) {
        this.serviceprovider = serviceprovider;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Connection() {
    }

    public Connection(int id, ServiceProvider serviceprovider, User user) {
        this.id = id;
        this.serviceprovider = serviceprovider;
        this.user = user;
    }
}
