package com.zgamelogic.controllers;

import com.zgamelogic.discord.auth.data.database.authData.AuthDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class MainController {
    private final AuthDataRepository authDataRepository;
}
