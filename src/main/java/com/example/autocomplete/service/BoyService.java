package com.example.autocomplete.service;
import com.example.autocomplete.entity.Boy; // Adjust the import

import com.example.autocomplete.repository.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoyService {
    @Autowired
    private BoyRepository boyRepository;

    public List<String> autoComplete(String prefix) {
        return boyRepository.findByNameStartingWithIgnoreCase(prefix)
                .stream()
                .map(Boy::getName)
                .collect(Collectors.toList());
    }
}