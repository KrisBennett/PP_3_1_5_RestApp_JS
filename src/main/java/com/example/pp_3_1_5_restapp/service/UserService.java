package com.example.pp_3_1_5_restapp.service;

import com.example.pp_3_1_5_restapp.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    Optional<User> findByEmail(String email);
}
