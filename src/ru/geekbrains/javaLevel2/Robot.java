package ru.geekbrains.javaLevel2;

public class Robot implements Runnable, Jumpable{
    public Robot(String name, int runLength, int jumpHeight) {
        System.out.println(name + " Running " + runLength + " Jumping " + jumpHeight);
    }

//    @Override
//    public void jump() {
//        System.out.println("Robot jump");
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Robot run");
//    }
}
