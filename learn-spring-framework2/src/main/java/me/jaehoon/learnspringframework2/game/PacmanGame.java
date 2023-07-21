package me.jaehoon.learnspringframework2.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // AnnotationConfiguration에서 자동감지 후보로 간주된다.
public class PacmanGame implements GameConsole {
    @Override
    public void up() {
        System.out.println("Pacman : up");
    }

    @Override
    public void down() {
        System.out.println("Pacman : down");
    }

    @Override
    public void left() {
        System.out.println("Pacman : left");
    }

    @Override
    public void right() {
        System.out.println("Pacman : right");
    }
}
