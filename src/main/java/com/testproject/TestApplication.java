package com.testproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.testproject.models.ApplicationUser;
import com.testproject.repository.UserRepository;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            ApplicationUser applicationUser = new ApplicationUser();
            applicationUser.setUserId(1);
            applicationUser.setUsername("admin");
            applicationUser.setPassword(passwordEncoder.encode("password"));

            userRepository.save(applicationUser);
            System.out.println("Saved admin user.");
        };
    }
}
