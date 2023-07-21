package me.jaehoon.learnspringframework2.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GameConsole game;

    public GameRunner(GameConsole gameConsole) {
        this.game = gameConsole;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
