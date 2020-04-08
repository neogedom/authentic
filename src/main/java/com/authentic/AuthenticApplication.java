package com.authentic;

import com.authentic.model.Professor;
import com.authentic.model.Requesting;
import com.authentic.model.Student;
import com.authentic.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticApplication.class, args);
		//------------------------- Trecho usado para teste
		User userStudent = new User("aluno", "senha", Student.class);
		Student student = new Student("Aluno", userStudent);
		User userProfessor = new User("aluno", "senha", Professor.class);
		Professor professor = new Professor("Professor", userProfessor);
		User userRequesting = new User("aluno", "senha", Requesting.class);
		Requesting requesting = new Requesting("Empresa", userRequesting);
		//-------------------------------------------------
		System.out.println(student.getUser().getProfile());
		System.out.println(professor.getUser().getProfile());
		System.out.println(requesting.getUser().getProfile());
	}

}
