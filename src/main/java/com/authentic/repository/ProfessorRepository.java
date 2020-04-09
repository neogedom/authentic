package com.authentic.repository;

import com.authentic.model.Professor;
import com.authentic.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    List<Professor> findByNameIgnoreCaseContaining(String name);

}
