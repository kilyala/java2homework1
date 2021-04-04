package ru.geekbrains.javaLevel2;

public class Cat implements Runnable, Jumpable{
    public Cat(String name, int runLength, int jumpHeight) {
        System.out.println(name + " Running " + runLength + " Jumping " + jumpHeight);
    }

//    @Override
//    public void jump() {
//        System.out.println("Cat jump");
//
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Cat run");
//
//    }
}
