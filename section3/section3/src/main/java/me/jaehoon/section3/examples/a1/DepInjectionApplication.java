package me.jaehoon.section3.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// YourBusinessClass
// Dep1
// Dep2

@Component
class MyBusinessClass {
     // field injection
    DependencyOne dependencyOne;

    DependencyTwo dependencyTwo;

    public MyBusinessClass(DependencyOne dependencyOne, DependencyTwo dependencyTwo) {
        System.out.println("Constructor Dependency Injection - MyBusinessClass");
        this.dependencyOne = dependencyOne;
        this.dependencyTwo = dependencyTwo;
    }

    //    @Autowired
//    public void setDependencyOne(DependencyOne dependencyOne) {
//        System.out.println("Setter Injection - setDependency 1");
//        this.dependencyOne = dependencyOne;
//    }
//
//    @Autowired
//    public void setDependencyTwo(DependencyTwo dependencyTwo) {
//        System.out.println("Setter Injection - setDependency 2");
//        this.dependencyTwo = dependencyTwo;
//    }

    public String toString() {
        return "Using " + dependencyOne + " and " + dependencyTwo;
    }
}

@Component
class DependencyOne {

}

@Component
class DependencyTwo {

}

@Configuration
@ComponentScan // 대상이 없다면 이 패키지를 스캔하게 된다.
public class DepInjectionApplication {
    public static void main(String[] args) {
        try(
                var context = new AnnotationConfigApplicationContext(DepInjectionApplication.class);
        ) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(MyBusinessClass.class));
        }
    }
}
