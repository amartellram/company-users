package com.techtalks.companyusers.service;

import com.techtalks.companyusers.domain.User;

import java.util.List;

public interface UsersService {
    User save(User user);
    List<User> findAll();
}
