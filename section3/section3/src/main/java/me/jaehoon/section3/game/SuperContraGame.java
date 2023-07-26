package me.jaehoon.section3.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GameConsole {
    @Override
    public void up() {
        System.out.println("Contra : up!");
    }

    @Override
    public void down() {
        System.out.println("Contra : down!");
    }

    @Override
    public void left() {
        System.out.println("Contra : left!");
    }

    @Override
    public void right() {
        System.out.println("Contra : right!");
    }
}
