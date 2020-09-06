package com.techtalks.companyusers.web;

import com.techtalks.companyusers.domain.User;
import com.techtalks.companyusers.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return this.usersService.save(user);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return this.usersService.findAll();
    }
}
