package com.authentic.repository;

import com.authentic.model.Requesting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RequestingRepository extends JpaRepository<Requesting, Long> {

    List<Requesting> findByNameIgnoreCaseContaining(String name);

}
