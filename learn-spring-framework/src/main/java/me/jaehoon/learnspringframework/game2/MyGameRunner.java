package me.jaehoon.learnspringframework.game2;

import me.jaehoon.learnspringframework.game.GameConsole;

public class MyGameRunner {
    private GameConsole gameConsole;

    public MyGameRunner(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    public void run() {
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }
}
