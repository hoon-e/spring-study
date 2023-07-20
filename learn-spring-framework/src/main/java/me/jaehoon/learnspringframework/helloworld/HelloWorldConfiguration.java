package me.jaehoon.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address (String firstLine, String city) {}
record Person (String name, int age, Address address) {}

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
        return new Person("jaehoon", 28, new Address("cheongju", "city"));
    }

    @Bean(name="address2")
    public Address address() {
        return new Address("seoul", "gwanak");
    }

    // 이 부분에서 에러가 발생한다.
    @Bean(name="address3")
    public Address address3() {
        return new Address("baker street", "london");
    }

    // name과 age bean을 사용하게 하려면 어떻게 하면될까?
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    // 매개변수로 역시 적절한 bean을 재활용할 수 있다.
    // 매개변수의 이름은 메서드 이름과 동일해야 한다.
    // 이때는 메서드 호출이 필요없고, 매개변수로 넘어온 값을 사용해주면 된다.
    @Bean
    public Person person3MethodCall(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    // 매개변수 정의를 Primary와, Qualifier 어노테이션을 이용하여 정의할 수 있다.
    // Qualifier 어노테이션은 매개변수에 Qualifier 어노테이션을 붙여줌으로써 설정할 수가 있다.
}
