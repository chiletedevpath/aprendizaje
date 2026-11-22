package com.chiletedevpath.seguridad.memoria;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Servicio de usuarios simulado, sin conexión a base de datos.
 */
@Service
public class UsuarioDetailsService implements UserDetailsService {

    private final UserDetails usuarioDemo;

    public UsuarioDetailsService(
            @Value("${app.demo.username}") String username,
            @Value("${app.demo.password}") String password,
            PasswordEncoder passwordEncoder) {
        this.usuarioDemo = User.withUsername(username)
                .password(passwordEncoder.encode(password))
                .roles("STUDENT")
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (usuarioDemo.getUsername().equals(username)) {
            return usuarioDemo;
        }
        throw new UsernameNotFoundException("Usuario no encontrado");
    }
}
