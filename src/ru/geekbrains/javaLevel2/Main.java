package ru.geekbrains.javaLevel2;

public class Main {

    public static void main(String[] args) {
	Human human = new Human("Ivan", 200, 5);
	Cat cat = new Cat("Tom", 100, 10);
	Robot robot = new Robot("T800", 1000, 15);
	Track track = new Track(150);
	Wall wall = new Wall(8);

	Object[] objects = {human, cat, robot};
	Object[] events = {track, wall};

	for (Object participants : objects) {
		if (participants instanceof Runnable) {
			((Runnable) participants).run();
			}
		if (participants instanceof Jumpable) {
			((Jumpable) participants).jump();
			}
		}
    }
}
