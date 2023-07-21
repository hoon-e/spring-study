package me.jaehoon.learnspringframework2.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole {
    @Override
    public void up() {
        System.out.println("Mario : up");
    }

    @Override
    public void down() {
        System.out.println("Mario : down");
    }

    @Override
    public void left() {
        System.out.println("Mario : left");
    }

    @Override
    public void right() {
        System.out.println("Mario : right");
    }
}
