package ru.geekbrains.javaLevel2;

public class Main {

    public static void main(String[] args) {
	Human human = new Human(200, 5);
	Cat cat = new Cat(100, 10);
	Robot robot = new Robot(1000, 15);
	Track track = new Track(150);
	Wall wall = new Wall(8);

	Object[] objects = {human, cat, robot};
	Object[] events = {track, wall};

		for (int i = 0; i < objects.length; i++) {
			System.out.println("Run " + objects[i].getClass().getSimpleName());
			for (int j = 0; j < events.length; j++) {
				System.out.println("Met " + events[j].getClass().getSimpleName());
				if (events instanceof Wall) {
					objects.runLength
				}
			}

		}
    }
}


//
//if (participants instanceof Runnable) ((Runnable) participants).runLength;
//		if (participants instanceof Jumpable) {
//		((Jumpable) participants).jumpHeight();
//		}