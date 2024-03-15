package com.example.autocomplete.repository;

import com.example.autocomplete.entity.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoyRepository extends JpaRepository<Boy, Long> {
    List<Boy> findByNameStartingWithIgnoreCase(String prefix);

}
