package com.mymonkmindset.health.config;


import com.mymonkmindset.health.entity.User;
import com.mymonkmindset.health.model.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
