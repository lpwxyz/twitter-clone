package com.lpw.twitter_clone.controller;

import com.lpw.twitter_clone.dto.User;
import com.lpw.twitter_clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable Long id) {
        return this.service.getUser(id);
    }
}
