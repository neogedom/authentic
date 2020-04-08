package com.authentic.model;

public class Student extends Person {


    //Atribuindo um perfil no ato de construção do objeto
    public Student(String nome, String username, String password) {
        super(nome, username, password, Student.class);
    }

}
