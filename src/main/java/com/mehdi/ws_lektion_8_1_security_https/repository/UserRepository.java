package com.mehdi.ws_lektion_8_1_security_https.repository;

import com.mehdi.ws_lektion_8_1_security_https.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

