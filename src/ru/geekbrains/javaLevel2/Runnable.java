package ru.geekbrains.javaLevel2;

public interface Runnable {
    default void run() {
        boolean runLength(int trackLength);
        System.out.println("Object run");
    }
}
