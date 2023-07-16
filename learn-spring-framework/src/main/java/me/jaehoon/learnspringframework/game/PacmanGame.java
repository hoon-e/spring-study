package me.jaehoon.learnspringframework.game;

public class PacmanGame implements GameConsole {
    public void up() {
        System.out.println("Pacman : Go Up!");
    }

    public void down() {
        System.out.println("Pacman : Go Down!");
    }

    public void left() {
        System.out.println("Pacman : Go Left!");
    }

    public void right() {
        System.out.println("Pacman : Go Right!");
    }
}
