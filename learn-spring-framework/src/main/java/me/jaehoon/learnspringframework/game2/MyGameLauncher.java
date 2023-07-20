package me.jaehoon.learnspringframework.game2;

import me.jaehoon.learnspringframework.game.GameConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyGameLauncher {
    public static void main(String[] args) {
        try(
                var context = new AnnotationConfigApplicationContext(MyGameConfiguration.class);
                ) {

            // 단순히 GameConsole 인터페이스 내에서, 클래스를 생성해줌으로써 리턴이 가능하다.
            context.getBean(GameConsole.class).up();
            context.getBean(MyGameRunner.class).run();
        }
    }
}
