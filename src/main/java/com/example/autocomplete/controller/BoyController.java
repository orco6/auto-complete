package com.example.autocomplete.controller;

import com.example.autocomplete.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoyController {
    @Autowired
    private BoyService boyService;

    @GetMapping("/auto-complete")
    public List<String> autoComplete(@RequestParam String prefix) {
        return boyService.autoComplete(prefix);
    }
}
