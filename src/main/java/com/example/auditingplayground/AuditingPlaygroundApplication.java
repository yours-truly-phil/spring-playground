package com.example.auditingplayground;

import com.example.auditingplayground.data.Person;
import com.example.auditingplayground.data.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class AuditingPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditingPlaygroundApplication.class, args);
    }


    @Bean
    public CommandLineRunner initDatabase(PersonRepository repository) {
        return args -> {
            repository.save(new Person("Alice"));
            repository.save(new Person("Bob"));

            repository.findAll().forEach(System.out::println);
        };
    }

}
