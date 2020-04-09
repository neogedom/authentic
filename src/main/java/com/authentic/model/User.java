package com.authentic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;

//import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class User extends AbstractEntity {

    @NotEmpty(message = "The field username must be provided")
    @Column(unique = true)
    private String username;
    @NotEmpty(message = "The field password must be provided")
    @JsonIgnore
    private String password;
    @NotEmpty(message = "The field profile must be provided")
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
