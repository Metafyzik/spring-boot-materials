package com.example.thymeleaf_UI.controller;


import com.example.thymeleaf_UI.model.UserModel;
import com.example.thymeleaf_UI.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String showLoginPage(@RequestParam(value = "error", required = false) String error,
                                @RequestParam(value = "logout", required = false) String logout,
                                Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password!");
        }
        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully.");
        }
        return "login_page";
    }

    @GetMapping("/registration")
    public String getRegistrationPage(Model model) {
        model.addAttribute("user", new UserModel());
        return "registration_page";
    }

    @PostMapping("/registration")
    public String processRegister(@ModelAttribute("user") @Valid UserModel userDto,
                                  BindingResult result, RedirectAttributes redirectAttributes) {
        { //TODO what does bindingResult do?

            userService.registerUser(userDto, result);

            if (result.hasErrors()) {
                return "registration_page"; //TODO it will show the form with errors specified in "UseDto"
            }

            redirectAttributes.addFlashAttribute("successMessage", "Registration successful! Please log in.");

            System.out.println("User registered: " + userDto.getUsername()); //TODO
            return "redirect:/login?success";
        }
    }
}
