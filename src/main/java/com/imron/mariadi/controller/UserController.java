package com.imron.mariadi.controller;


import com.imron.mariadi.model.User;
import com.imron.mariadi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;

    }

    @PostMapping
    public String createUser(@RequestBody User request) {
        userService.addUser(request);
        return "user berhasil diinput";

    }

    @GetMapping
    public List<User> getAlluser(){
        return userService.getAllusers();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return "data berhasil di hapus";
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return (User) userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User request){
        userService.updateUser(id, request);
        return "data berhasil diupdate";
    }
}
