package com.natujenge.cheri.repository;

import com.natujenge.cheri.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
