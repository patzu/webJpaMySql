package com.wikichera.webJpaMysql;

import javax.persistence.*;

@Entity
@Access(AccessType.PROPERTY)
public class Admin {

    private Long id;
    private String userName;
    private String password;

    public Admin() {
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "adminId")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "User_Name")
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

    @Override
    public String toString() {
        return String.format(
                "Admin[id=%d, userName='%s', password='%s']",
                id, userName, password);
    }
}