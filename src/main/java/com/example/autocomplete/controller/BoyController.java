package com.example.autocomplete.controller;

import com.example.autocomplete.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class BoyController {
    @Autowired
    private BoyService boyService;

    @GetMapping("/auto-complete")
    public ResponseEntity<List<String>> autoComplete(@RequestParam String prefix) {
        List<String> autoCompletedNames = boyService.autoComplete(prefix);
        if (!autoCompletedNames.isEmpty()) {
            return ResponseEntity.ok(autoCompletedNames);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
