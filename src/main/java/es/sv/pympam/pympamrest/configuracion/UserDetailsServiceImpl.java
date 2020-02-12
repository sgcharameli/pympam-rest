package es.sv.pympam.pympamrest.configuracion;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        final List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("usario"));
        final UserDetails userDetails = new User("usu1", "$2a$10$TvEfzK0G62xsNdqS44Ko1u0EsGA0L4nKGWTGED84HJ426YSq3ccjq", authorities);
        return userDetails;
    }
}
