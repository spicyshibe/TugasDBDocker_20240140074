package com.imron.mariadi.service;

import com.imron.mariadi.model.user;
import com.imron.mariadi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public user addUser(user request){
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }
    public List<user> getAllusers(){
        return userRepository.findAll();
    }
    public user getUserById(String id){
        return userRepository.findById(id).orElse(null);

    }

    public user updateUser(String id, user request){
        user existingUser = userRepository.findById(id).orElse(null);
        if (existingUser!= null){
            existingUser.setName(request.getName());
        }
        return null;

    }

    public void deleteUser(String id)
    {
        userRepository.deleteById(id);
    }
}
