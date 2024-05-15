package org.asc.taskmanagementsystem.repository;

import org.asc.taskmanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
