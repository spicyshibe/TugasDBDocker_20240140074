package com.imron.mariadi.repository;

import com.imron.mariadi.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <user, String> {

}
