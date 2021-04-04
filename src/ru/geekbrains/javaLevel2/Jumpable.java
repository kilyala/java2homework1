package ru.geekbrains.javaLevel2;

public interface Jumpable {
    default void jump(){
        System.out.println("Object jump");
//        boolean jump(int wallHeight);
//        if (wallHeight) {
//            System.out.println("Good jump");
//        } else {
//            System.out.println("Jump failed");
//        }

    }
}
