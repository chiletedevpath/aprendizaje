package com.chiletedevpath.seguridad.jpa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AutenticacionJpaH2Application {

    public static void main(String[] args) {
        SpringApplication.run(AutenticacionJpaH2Application.class, args);
    }

    @Bean
    public CommandLineRunner initData(
            UsuarioRepository repository,
            PasswordEncoder encoder,
            @Value("${app.demo.username}") String username,
            @Value("${app.demo.password}") String password) {
        return args -> {
            if (repository.findByUsername(username).isEmpty()) {
                Usuario usuario = new Usuario();
                usuario.setUsername(username);
                usuario.setPassword(encoder.encode(password));
                usuario.setRol("STUDENT");
                repository.save(usuario);
            }
        };
    }
}
