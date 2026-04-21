package com.imron.mariadi.repository;

import com.imron.mariadi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {

}
