package me.jaehoon.learnspringframework.game2;

import me.jaehoon.learnspringframework.game.GameConsole;
import me.jaehoon.learnspringframework.game.MarioGame;
import me.jaehoon.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyGameConfiguration {
    @Bean
    public PacmanGame getPacman() {
        return new PacmanGame();
    }

    @Bean
    public MarioGame getMario() {
        return new MarioGame();
    }

    @Bean
    @Primary
    public GameConsole getPacmanGame() {
        return getPacman();
    }

    @Bean
    public GameConsole getMarioGame() {
        return getMario();
    }

    @Bean
    public MyGameRunner gameRunner(GameConsole game) {
        return new MyGameRunner(game);
    }
}
