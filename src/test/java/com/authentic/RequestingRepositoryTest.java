package com.authentic;

import com.authentic.model.Professor;
import com.authentic.model.Requesting;
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
public class RequestingRepositoryTest {


    @Autowired
    private RequestingRepository requestingRepository;


    @Test
    public void createRequestingShouldPersistData() {
        User userRequesting = new User("requesting", "senha", Requesting.class);
        Requesting requesting = new Requesting("Requesting", userRequesting);
        requesting = requestingRepository.save(requesting);
        assertThat(requesting.getId()).isNotNull();
        assertThat(requesting.getName()).isEqualTo("Requesting");
        assertThat(requesting.getUser().getUsername()).isEqualTo("requesting");
        assertThat(requesting.getUser().getPassword()).isEqualTo("senha");
        assertThat(requesting.getUser().getProfile()).isEqualTo(Requesting.class);
    }
}
