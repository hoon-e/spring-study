package me.jaehoon.learnspringframework2;

import me.jaehoon.learnspringframework2.game.GameConsole;
import me.jaehoon.learnspringframework2.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.jaehoon.learnspringframework2.game") // ComponentScan을 붙여서, 어디서 Bean을 Scan할지 정한다.
public class GamingAppLauncherApplication {
    // 요 Bean을 삭제해본다.
    // 에러가 난다.
    // GameConsole의 구현체인 PacmanGame을 Spring이 찾을 곳을 찾지 못하기 때문이다.
//    @Bean
//    public GameConsole game() {
//        // 이 코드를 Spring이 생성하게끔 어떻게 할까?
//        return new PacmanGame();
//    }

//    @Bean
//    public GameRunner gameRunner(GameConsole game) {
//        return new GameRunner(game);
//    }

    public static void main(String[] args) {
        try(
                var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
                ) {
            var game = context.getBean(GameConsole.class);
            game.up();
            game.down();

            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
