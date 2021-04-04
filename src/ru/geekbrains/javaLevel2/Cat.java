package ru.geekbrains.javaLevel2;

public class Cat implements Runnable, Jumpable {
    public int maxLength;
    public int maxHeight;

    public Cat(int maxLength, int maxHeight) {
        this.maxLength=maxLength;
        this.maxHeight=maxHeight;
        System.out.println(" Running " + maxLength + " Jumping " + maxHeight);
    }

    @Override
    public boolean runLength(int trackLength) {
        return this.maxLength >= trackLength;
    }

    @Override
    public boolean jumpHeight(int wallHeight) {
        return this.maxHeight >= wallHeight;
    }
}
