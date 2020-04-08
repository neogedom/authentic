package com.authentic.model;

//Por enquanto, a única razão de termos essa classe é para marcar um perfil
public class Requesting extends Person {

    //Atribuindo um perfil no ato de construção do objeto
    public Requesting(String nome, String username, String password) {
        super(nome, username, password, Requesting.class);
    }
}
