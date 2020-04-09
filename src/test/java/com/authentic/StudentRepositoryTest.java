package com.authentic;

import com.authentic.model.Professor;
import com.authentic.model.Student;
import com.authentic.model.User;
import com.authentic.repository.RequestingRepository;
import com.authentic.repository.StudentRepository;
import com.authentic.repository.ProfessorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private RequestingRepository requestingRepository;

    @Test
    public void createStudentShouldPersistData() {
        User userStudent = new User("aluno", "senha", Student.class);
        Student student = new Student("Aluno", userStudent);
        student = studentRepository.save(student);
        assertThat(student.getId()).isNotNull();
        assertThat(student.getName()).isEqualTo("Aluno");
        assertThat(student.getUser().getUsername()).isEqualTo("aluno");
        assertThat(student.getUser().getPassword()).isEqualTo("senha");
        assertThat(student.getUser().getProfile()).isEqualTo(Student.class);
    }

    @Test
    public void createProfessorShouldPersistData() {
        User userProfessor = new User("professor", "senha", Professor.class);
        Professor professor = new Professor("Professor", userProfessor);
        professor = professorRepository.save(professor);
        assertThat(professor.getId()).isNotNull();
        assertThat(professor.getName()).isEqualTo("Professor");
        assertThat(professor.getUser().getUsername()).isEqualTo("professor");
        assertThat(professor.getUser().getPassword()).isEqualTo("senha");
        assertThat(professor.getUser().getProfile()).isEqualTo(Professor.class);
    }

//    @Test
//    public void createRequestingShouldPersistData() {
//        User userRequesting = new User("professor", "professor", Student.class);
//        Student student = new Student("Aluno", userStudent);
//        student = studentRepository.save(student);
//        assertThat(student.getId()).isNotNull();
//        assertThat(student.getName()).isEqualTo("Aluno");
//        assertThat(student.getUser().getUsername()).isEqualTo("aluno");
//        assertThat(student.getUser().getPassword()).isEqualTo("senha");
//        assertThat(student.getUser().getProfile()).isEqualTo(Student.class);
//    }
}
