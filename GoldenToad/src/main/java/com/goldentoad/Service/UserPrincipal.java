
package com.goldentoad.Service;

import com.goldentoad.entity.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author David
 */
public class UserPrincipal implements UserDetails{
    
    private Person person; 
    
    public UserPrincipal (Person person){
        this.person = person; 
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
          /*  Se crea una lista de tipo GrantedAuthority que es un permiso que le
         permite al usuario lo que puede o no hacer. */
      List<GrantedAuthority> authorities = new ArrayList<>();
      
      
      // Extract list of permmisions (name)
      
      this.person.getPermissionList().forEach(p -> {
          GrantedAuthority authority = new SimpleGrantedAuthority(p); 
          authorities.add(authority); 
    });
      
       // Extract list of roles (ROLE_name)
      /* El permiso GrantedAuthorty solo permite que se le ponga ROLE_ para
      identificar si es un role como tal. */
       this.person.getRoleList().forEach(r -> {
          GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r); 
          authorities.add(authority); 
      });
      return authorities; 
    }

    @Override
    public String getPassword() {
        return this.person.getPassword();
    }
    
    
    // En el return se esta usando username ***
    @Override
    public String getUsername() {
         return this.person.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; 
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; 
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; 
    }
     
   // Para saber si esta activo o inactivo
    @Override
    public boolean isEnabled() {
        return this.person.getActive()==1;  
    }
    
}
