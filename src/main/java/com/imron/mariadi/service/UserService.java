package com.imron.mariadi.service;

import com.imron.mariadi.model.User;
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

    public User addUser(User request){
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }
    public List<User> getAllusers(){
        return userRepository.findAll();
    }
    public User getUserById(String id){
        return userRepository.findById(id).orElse(null);

    }

    public User updateUser(String id, User request){
        User existingUser = userRepository.findById(id).orElse(null);
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
