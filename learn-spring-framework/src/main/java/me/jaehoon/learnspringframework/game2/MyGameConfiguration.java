package me.jaehoon.learnspringframework.game2;

import me.jaehoon.learnspringframework.game.MarioGame;
import me.jaehoon.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyGameConfiguration {
    @Bean
    public PacmanGame getPacman() {
        return new PacmanGame();
    }

    @Bean
    public MarioGame getMarioGame() {
        return new MarioGame();
    }

    @Bean
    public MyGameRunner getMarioGameRunner(MarioGame marioGame) {
        return new MyGameRunner(marioGame);
    }
}
