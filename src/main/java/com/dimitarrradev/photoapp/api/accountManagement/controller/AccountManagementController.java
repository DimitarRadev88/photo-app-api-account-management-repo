package com.dimitarrradev.photoapp.api.accountManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountManagementController {

    @GetMapping("/check/status")
    public String status() {
        return "Working!";
    }

}
