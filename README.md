# Spring boot learning materials

These are the learning materials from my self-study, which I have created to grasp the vast possibilities of Spring Boot.

## [spring-security directory](./spring-security/)
The project shows how to implement spring security with JWT token authorization.

### Short description of related spring security concepts
- **SecurityFilterChain**<br>
  A special filter chain that is automatically set up when using Spring Security. It consists of multiple filters responsible for handling authentication, authorization, CSRF protection, session management,   etc. 
- **OncePerRequestFilter**<br>
  An abstract class that allows you to create custom security filters. It ensures that a filter runs only once per request, even if the request is forwarded multiple times.
- **UserDetails**, **UserDetailsService**<br> 
  In Spring Security, the UserDetailsService interface is responsible for retrieving user details from a data source (e.g., database, LDAP, or an in-memory store) for authentication and authorization. It returns a UserDetails object that        Spring Security uses for authentication & authorization.
- **SessionCreationPolicy.STATELESS**<br> 
  Used to disable session management, ensuring that Spring Security does not create or use HTTP sessions. This is commonly used in JWT-based authentication and REST APIs, where each request is independently authenticated.
- **@EnableWebSecurity**<br> 
  An annotation in Spring Security that enables and customizes web security in a Spring Boot application. 
- **AuthenticationProvider**<br> 
 The AuthenticationProvider interface in Spring Security is responsible for verifying user credentials and providing authentication. It acts as a bridge between authentication requests and the underlying authentication logic (such as database checks, LDAP, OAuth, or JWT validation).
- **AuthenticationManager**<br> 
  Responsible for handling authentication requests. It acts as the central coordinator that delegates authentication to one or more AuthenticationProviders.
- **org.springframework.security.core.userdetails.User**<br> 
  A built-in implementation of the UserDetails interface provided by Spring Security.
- **http.csrf(csrf -> csrf.disable())**<br>
  Used to disable Cross-Site Request Forgery (CSRF) protection which is often done in stateless applications (e.g., REST APIs using JWT authentication) where CSRF protection is not needed.

for more [detailed descriptions](./https://chatgpt.com/share/67e501ff-9160-8006-9f0d-019b632da1bb/)

## [thymeleaf-UI directory](./thymeleaf-UI/)
This project demonstrates how to implement a styled registration and login form, as well as a navbar that adapts to different user roles using Thymeleaf and Bootstrap.

### Short description of related thymeleaf concepts

- **sec:authorize**<br> 
  An ttribute that allows you to conditionally display elements based on user roles, authentication status, or expressions.
- **BindingResult**<br> 
  Used for form validation. It holds validation errors and allows you to display error messages in the Thymeleaf template.
- **RedirectAttributes**<br>
  Used to pass flash attributes when performing a redirect. It helps transfer data between requests, especially after form submissions.

for more [detailed descriptions](./https://chatgpt.com/share/67eaae35-5264-8006-b108-67b0158cb2ba/)
