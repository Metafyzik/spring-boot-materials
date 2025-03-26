package example.hello_security.controllers;

import example.hello_security.Service.MyUserDetailsService;
import example.hello_security.model.Person;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HomeController {


    private List<Person> people = new ArrayList<>(List.of(new Person(1,"ana",120),new Person(2,"nana",113)));

    @Autowired
    private MyUserDetailsService userDetailsService;
    @GetMapping("/people")
    public List<Person> home(){
/*
        UserDetails userDetails = userDetailsService.loadUserByUsername("notUser");

        String password = userDetails.getPassword();
        String userName = userDetails.getUsername();

        Map<String,String> response = new HashMap<>();

        response.put("session id: ",request.getSession().getId());
        response.put("user password: ", password);
        response.put("user name: ", userName);
        response.put("Request received for URI ", request.getRequestURI());

        System.out.println(response);
*/

        return people;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");

    }

}
