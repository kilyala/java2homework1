package ru.geekbrains.javaLevel2;

public class Human implements Runnable, Jumpable {
    public Human(String name, int runLength, int jumpHeight) {
        System.out.println(name + " Running " + runLength + " Jumping " + jumpHeight);
    }

//    @Override
//    public void jump() {
//        System.out.println("Human jump");
//
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Human run");
//    }
}
