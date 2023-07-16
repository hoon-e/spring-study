package me.jaehoon.learnspringframework;

import me.jaehoon.learnspringframework.game.MarioGame;

public class Main01GameStart {
    public static void main(String[] args) {
        // Q1. MarioGame을 생성한다.
        var game = new MarioGame();

        // Q2. 만약 PacmanGame을 생성한다면?
        // var game = new PacmanGame();

        // Q3. 그럼 위 강한 결합을 약하게 만들려면 어떻게 하면 될까?
        // 인터페이스를 사용한다.
        // 게임이 변경되더라도, GameRunner에는 변경사항이 없도록 하는 것이다.

        // 생성자에 Game을 넣는다.
        // 이렇게 되면 특정 클래스끼리 강하게 결합된다.
        var gameRunner = new GameRunner(game);

        // game을 실행한다.
        gameRunner.run();
    }
}
