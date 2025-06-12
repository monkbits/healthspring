package com.mymonkmindset.health.User;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args ->  {
            User ankur = new User(27, 105);
            User vani  = new User(18,75);

//            repository.saveAll(List.of(ankur, vani));
        };
    }
}
