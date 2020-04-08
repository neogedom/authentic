package com.authentic;

import com.authentic.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticApplication.class, args);
		Student student = new Student("Aluno", "aluno", "senha");
		System.out.println(student.getUser().getProfile());
	}

}
