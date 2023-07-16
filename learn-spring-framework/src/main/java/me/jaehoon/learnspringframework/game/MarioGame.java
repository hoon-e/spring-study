package me.jaehoon.learnspringframework.game;

// 각 클래스에 인터페이스를 상속해준다.
public class MarioGame implements GameConsole {
    public void up() {
        System.out.println("Mario : Go Up!");
    }

    public void down() {
        System.out.println("Mario : Go Down!");
    }

    public void left() {
        System.out.println("Mario : Go Left!");
    }

    public void right() {
        System.out.println("Mario : Go Right!");
    }
}
