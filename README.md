# Spring boot learning materials

These are materials learning materials of my self study I've created to graps wast possibilities of Spring boot framework.

## [spring-security directory](./spring-security/)
The project show how to implement spring security basic authentication and JWT token authorization.

### Short description of important spring security concepts
- **SecurityFilterChain**<br>
  It is special filter chain which is automatically set up when using Spring Security. It consists of multiple filters responsible for handling authentication, authorization, CSRF protection, session management,   etc. 
- **OncePerRequestFilter**<br>
  It is an abstract class that allows you to create custom security filters. It ensures that a filter runs only once per request, even if the request is forwarded multiple times.
- **UserDetails**, **UserDetailsService**<br> 
  In Spring Security, the UserDetailsService interface is responsible for retrieving user details from a data source (e.g., database, LDAP, or an in-memory store) for authentication and authorization. It returns a UserDetails object that        Spring Security uses for authentication & authorization.
- **SessionCreationPolicy.STATELESS**<br> 
  s used to disable session management, ensuring that Spring Security does not create or use HTTP sessions. This is commonly used in JWT-based authentication and REST APIs, where each request is independently authenticated.
- **@EnableWebSecurity**<br> 
  It is an annotation in Spring Security that enables and customizes web security in a Spring Boot application. 
- **AuthenticationProvider**<br> 
 The AuthenticationProvider interface in Spring Security is responsible for verifying user credentials and providing authentication. It acts as a bridge between authentication requests and the underlying authentication logic (such as database checks, LDAP, OAuth, or JWT validation).
- **AuthenticationManager**<br> 
  It is responsible for handling authentication requests. It acts as the central coordinator that delegates authentication to one or more AuthenticationProviders.
- **org.springframework.security.core.userdetails.User**<br> 
  It is a built-in implementation of the UserDetails interface provided by Spring Security.
- **http.csrf(csrf -> csrf.disable())**<br>
  It is used to disable Cross-Site Request Forgery (CSRF) protection which is often done in stateless applications (e.g., REST APIs using JWT authentication) where CSRF protection is not needed.

for more [detailed explainations](./https://chatgpt.com/share/67e501ff-9160-8006-9f0d-019b632da1bb/)
