# Spring boot learning materials

These are materials learning materials of my self study I've created to graps wast possibilities of Spring boot framework.

## [spring-security directory](./spring-security/)
It contains project  implementing spring security basic authentication and JWT token authorization.

### Short description of important spring security concepts
- **SecurityFilterChain**
- **OncePerRequestFilter**
- **UserDetails**, **UserDetailsService**<br> 
In Spring Security, the UserDetailsService interface is responsible for retrieving user details from a data source (e.g., database, LDAP, or an in-memory store) for authentication and authorization. It returns a UserDetails object that        Spring Security uses for authentication & authorization.
- **SessionCreationPolicy.STATELESS**
  s used to disable session management, ensuring that Spring Security does not create or use HTTP sessions. This is commonly used in JWT-based authentication and REST APIs, where each request is independently authenticated.
- **@EnableWebSecurity**
  It is an annotation in Spring Security that enables and customizes web security in a Spring Boot application. 
- **AuthenticationProvider**
 The AuthenticationProvider interface in Spring Security is responsible for verifying user credentials and providing authentication. It acts as a bridge between authentication requests and the underlying authentication logic (such as database checks, LDAP, OAuth, or JWT validation).
- **AuthenticationManager**
  It is responsible for handling authentication requests. It acts as the central coordinator that delegates authentication to one or more AuthenticationProviders.
- **org.springframework.security.core.userdetails.User**
  It is a built-in implementation of the UserDetails interface provided by Spring Security.

