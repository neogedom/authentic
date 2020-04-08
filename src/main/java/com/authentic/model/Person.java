package com.authentic.model;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.persistence.Entity;
//import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


//@MappedSuperclass
public abstract class Person extends AbstractEntity {

   // @NotEmpty
    protected String nome;
    protected User user;

    public Person(String nome, User user) {
        this.nome = nome;
        this.user = user;
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
