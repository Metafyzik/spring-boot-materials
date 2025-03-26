package example.hello_security.Service;


import example.hello_security.model.UserPrincipal;
import example.hello_security.model.Users;
import example.hello_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       System.out.println("loadusername: " + username);

       Users user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found FUCK YOU"));

       System.out.println("loadusername after db check");

       System.out.println(user.getUsername() + " " + user.getPassword());
       // use UserPrincipal which implements userdetails
       return new UserPrincipal(user);

       // or use built-in implementation "User"
       /*        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                user.getRoles().stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role)).toList()
        );*/
    }
}
