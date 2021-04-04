package ru.geekbrains.javaLevel2;

public class Robot implements Runnable, Jumpable {
    private String name;
    public int runDistance;
    public int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.runDistance=runDistance;
        this.jumpHeight = jumpHeight;
        System.out.println(name + " Run " + runDistance + " Jump " + jumpHeight);
    }

    @Override
    public boolean run(int trackLength) {
        return this.runDistance >= trackLength;
    }


    @Override
    public boolean jump(int wallHeight) {
        return this.jumpHeight >= wallHeight;
    }
}
