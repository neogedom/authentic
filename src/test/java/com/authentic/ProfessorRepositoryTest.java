package com.authentic;

import com.authentic.model.Professor;
import com.authentic.model.Student;
import com.authentic.model.User;
import com.authentic.repository.ProfessorRepository;
import com.authentic.repository.RequestingRepository;
import com.authentic.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ProfessorRepositoryTest {

   @Autowired
    private ProfessorRepository professorRepository;

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

}
