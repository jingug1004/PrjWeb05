package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wtime on 2017-02-22. 오전 10:48
 * org.zerock.controller / Web03
 * It's now or never!
 */
public class CustomAuthenticationProvider implements AuthenticationProvider {

    public static final Logger logger =
            LoggerFactory.getLogger(CustomAuthenticationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String _id = (String)authentication.getPrincipal();
        String _pw = (String)authentication.getCredentials();

        logger.info("Welcome authenticate! {}", _id + "/ " + _pw);

        if(_id.equals("user1") && _pw.equals("1111")) {
            List<GrantedAuthority> roles = new ArrayList<>();
            roles.add(new SimpleGrantedAuthority("ROLE_USER"));

            UsernamePasswordAuthenticationToken result =
                    new UsernamePasswordAuthenticationToken(_id, _pw, roles);

            result.setDetails(new CustomUserDetails(_id, _pw, "ROLE_USER"));

        } else {
            return null;
        }
        return authentication;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
