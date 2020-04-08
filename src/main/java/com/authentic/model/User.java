package com.authentic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;

//import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class User extends AbstractEntity {

//    @NotEmpty
//    @Column(unique = true)
    private String username;
//    @NotEmpty
//    @JsonIgnore
    private String password;
//    @NotEmpty
    private Class profile;

    public User(String username, String password, Class profile) {
        super();
        this.username = username;
        this.password = password;
        this.profile = profile;

    }



    public Class getProfile() {
        return profile;
    }

    public void setProfile(Class profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
