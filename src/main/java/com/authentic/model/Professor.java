package com.authentic.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

//Por enquanto, a única razão de termos essa classe é para marcar um perfil
@Entity
public class Professor extends Person {

    //Atribuindo um perfil no ato de construção do objeto
    public Professor(String nome, User user) {
        super(nome, user);

    }
}
