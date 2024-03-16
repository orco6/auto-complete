package com.example.autocomplete.repository;

import com.example.autocomplete.entity.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoyRepository extends JpaRepository<Boy, Long> {
}
