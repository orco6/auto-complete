package com.example.autocomplete.service;

import com.example.autocomplete.entity.Boy;
import com.example.autocomplete.repository.BoyRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@Service
public class BoyService {
    private TreeMap<String, String> namesMap;

    @Autowired
    private BoyRepository boyRepository;

    @PostConstruct
    public void initNamesMap() {
        namesMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        List<Boy> boys = boyRepository.findAll();
        for (Boy boy : boys) {
            namesMap.put(boy.getName(), boy.getName());
        }
    }

    public List<String> autoComplete(String prefix) {
        String prefixLower = prefix.toLowerCase();
        return new ArrayList<>(namesMap.subMap(prefixLower, prefixLower + Character.MAX_VALUE)
                .values());
    }
}