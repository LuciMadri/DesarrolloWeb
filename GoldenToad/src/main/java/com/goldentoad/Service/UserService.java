
package com.goldentoad.Service;

import com.goldentoad.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author David
 */

@Service
public class UserService implements UserDetailsService{

    
     @Autowired
    public IPersonService personService; 
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = this.personService.findByUsername(username); 
       UserPrincipal userPrincipal = new UserPrincipal (person); 
       return userPrincipal; 
    }
    
}
