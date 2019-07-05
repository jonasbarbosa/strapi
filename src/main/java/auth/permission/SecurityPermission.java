package auth.permission;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;

import cronapp.framework.authentication.security.Permission;

@Component
public class SecurityPermission implements Permission {

  
  
  @Override
  public void loadSecurityPermission(HttpSecurity http) throws Exception {
    // public
    http.authorizeRequests().antMatchers("/**").permitAll();
  }
  
}