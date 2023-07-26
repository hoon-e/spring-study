package me.jaehoon.section3.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GameConsole game;

    public GameRunner(@Qualifier("SuperContraGameQualifier") GameConsole gameConsole) {
        this.game = gameConsole;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
