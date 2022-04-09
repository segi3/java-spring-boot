package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static  java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student Rafi = new Student ("rafi@email.com", "Rafi Nizar", LocalDate.of(2000, MARCH, 15));
            Student Afiq = new Student ("afiq@email.com", "Afiq Fawwaz",  LocalDate.of(2002, MARCH, 15));

            repository.saveAll(
                    List.of(Rafi, Afiq)
            );
        };
    }
}
