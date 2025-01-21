package api.chatop.api.config;

import java.util.ArrayList;
import java.util.List;

import api.chatop.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import api.chatop.api.model.DBUser;

@Service
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    // Recherchez l'utilisateur dans la base de données
    DBUser dbUser = userRepository.findByUsername(username);
    if (dbUser == null) {
      throw new UsernameNotFoundException("User not found");
    }

    // Retournez un UserDetails avec les informations de DBUser
    return new User(dbUser.getUsername(), dbUser.getPassword(), getGrantedAuthorities(dbUser.getRole()));
  }

  private List<GrantedAuthority> getGrantedAuthorities(String role) {
    List<GrantedAuthority> authorities = new ArrayList<>();
    authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
    return authorities;
  }
}
