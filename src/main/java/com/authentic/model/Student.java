package com.authentic.model;

//Por enquanto, a única razão de termos essa classe é para marcar um perfil
public class Student extends Person {

    //Atribuindo um perfil no ato de construção do objeto
    public Student(String nome, String username, String password) {
        super(nome, username, password, Student.class);
    }

}
