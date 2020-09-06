package com.techtalks.companyusers.repository;

import com.techtalks.companyusers.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
