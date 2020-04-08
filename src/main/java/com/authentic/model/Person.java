package com.authentic.model;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.persistence.Entity;
//import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


//@MappedSuperclass
public abstract class Person extends AbstractEntity {

    @NotEmpty
    private String nome;
    private User user;

    @Autowired
    public Person(String nome, String username, String password, Class profile) {
        this.nome = nome;
        this.user = new User(username, password, profile);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
