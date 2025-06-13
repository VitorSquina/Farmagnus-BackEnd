package com.farmagnus.farmagnus.repository;

import com.farmagnus.farmagnus.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long>{
}
