package com.authentic.model;

//import javax.persistence.Entity;
//import javax.persistence.MappedSuperclass;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;


@MappedSuperclass
public abstract class Person extends AbstractEntity {

   @NotEmpty(message = "The field name be provided")
   protected String name;
   @OneToOne
   protected User user;

    public Person(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "nome='" + name + '\'' +
                '}';
    }
}
