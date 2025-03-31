package com.example.thymeleaf_UI.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data //TODO what this one does
public class UserModel {

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Email is required")
    //TODO this text appears if "requiered" is erased from html the field and email si missing
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}