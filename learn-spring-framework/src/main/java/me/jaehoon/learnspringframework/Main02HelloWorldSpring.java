package me.jaehoon.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Spring Context를 실행
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Spring Context가 관리하고자하는 부분을 설정해주는 것
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3. Spring에서 관리되는 Bean을 반환한다.
        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("address"));
    }
}
