package com.techtalks.companyusers.service;

import com.techtalks.companyusers.domain.User;
import com.techtalks.companyusers.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public User save(User user) {
        return this.usersRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return this.usersRepository.findAll();
    }
}
