package com.example.TheTelephone.repo;

import com.example.TheTelephone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
