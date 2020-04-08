package com.authentic.model;

//Por enquanto, a única razão de termos essa classe é para marcar um perfil
public class Professor extends Person {

    //Atribuindo um perfil no ato de construção do objeto
    public Professor(String nome, String username, String password) {
        super(nome, username, password, Professor.class);
    }
}
