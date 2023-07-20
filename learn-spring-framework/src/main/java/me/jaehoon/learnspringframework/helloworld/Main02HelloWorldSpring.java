package me.jaehoon.learnspringframework.helloworld;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main02HelloWorldSpring {
    private static final LoggerContext ctx = (LoggerContext) LoggerFactory.getILoggerFactory();
    private static final Logger logger = ctx.getLogger(Main02HelloWorldSpring.class);

    public static void main(String[] args) {
        // 1. Spring Context를 실행
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Spring Context가 관리하고자하는 부분을 설정해주는 것
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3. Spring에서 관리되는 Bean을 반환한다.
        logger.info(context.getBean("name").toString());

        logger.info(context.getBean("age").toString());

        logger.info(context.getBean("person").toString());

        logger.info(context.getBean("address2").toString());

        // context의 type도 사용할 수 있다.
        logger.info(context.getBean(Address.class).toString());

        logger.info(context.getBean("person2MethodCall").toString());

        logger.info(context.getBean("person3MethodCall").toString());
    }
}
