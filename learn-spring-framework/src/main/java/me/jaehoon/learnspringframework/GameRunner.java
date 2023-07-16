package me.jaehoon.learnspringframework;

import me.jaehoon.learnspringframework.game.GameConsole;
import me.jaehoon.learnspringframework.game.MarioGame;
import me.jaehoon.learnspringframework.game.PacmanGame;

public class GameRunner {
    // private MarioGame game;

    // Q2. 만약 여기가 팩맨 게임으로 변경되었다 가정해보자
    // 클래스 변수를 pacman game으로 변경해야 한다.
    // private PacmanGame game;

    // 생성자에 넣는 것도 pacman으로 변경해주어야 한다.
    // Game관련 클래스를 가지는 것이 아니라, 인터페이스를 가지도록 설정해주자.
    private GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
