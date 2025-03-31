package com.example.thymeleaf_UI.service;

import com.example.thymeleaf_UI.UsersRepository.UsersRepository;
import com.example.thymeleaf_UI.entity.Users;
import com.example.thymeleaf_UI.model.UserModel;

import com.example.thymeleaf_UI.model.UserRole;


import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Set;

@Service
@AllArgsConstructor
public class UserService {

    private final UsersRepository usersRepo;
    private final PasswordEncoder passwordEncoder;
    public void registerUser(UserModel userModel, BindingResult result) {

        // Check if username exists
        if (usersRepo.findByUsername(userModel.getUsername()).isPresent()) {
            result.rejectValue("username", "error.user", "Username is already taken");
        }

        // Check if email exists
        if (usersRepo.findByEmail(userModel.getEmail()).isPresent()) {
            result.rejectValue("email", "error.user", "Email is already registered");
        }

        // If errors exist, return early
        if (result.hasErrors()) {
            return;
        }

        Users user = new Users();
        user.setUsername(userModel.getUsername());
        user.setEmail(userModel.getEmail());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        //this makes everyone register with ROLE_USER
        user.setRoles(Set.of(UserRole.ROLE_USER));

        usersRepo.save(user);
    }
}
