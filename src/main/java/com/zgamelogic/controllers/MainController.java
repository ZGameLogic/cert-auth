package com.zgamelogic.controllers;

import com.zgamelogic.discord.auth.data.database.authData.AuthDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {
    private final AuthDataRepository authDataRepository;

    @GetMapping("health")
    public String health() {
        return "Healthy";
    }
}
