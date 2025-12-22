package com.eventplanner.user_service.test;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/me")
    public String me(Authentication auth) {
        return "Hello " + auth.getName();
    }
}
