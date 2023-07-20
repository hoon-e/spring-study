package me.jaehoon.learnspringframework.game2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyGameLauncher {
    public static void main(String[] args) {
        try(
                var context = new AnnotationConfigApplicationContext(MyGameConfiguration.class);
                ) {
            var marioGameRunner = context.getBean("getMarioGameRunner");
            marioGameRunner.run();
        }
    }
}
