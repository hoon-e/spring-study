package me.jaehoon.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}
record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "jaehoon!";
    }

    @Bean
    public int age() {
        return 28;
    }

    @Bean
    public Person person() {
        return new Person("jaehoon", 28);
    }

    @Bean
    public Address address() {
        return new Address("seoul", "gwanak");
    }
}
