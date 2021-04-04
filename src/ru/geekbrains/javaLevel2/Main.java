package ru.geekbrains.javaLevel2;

public class Main {

	public static void main(String[] args) {
		Human human = new Human("Bob", 200, 5);
		Cat cat = new Cat("Tom", 100, 10);
		Robot robot = new Robot("T800", 1000, 15);
		Track track = new Track(150);
		Wall wall = new Wall(10);

		Object[] objects = {human, cat, robot};
		Object[] events = {track, wall};


		for (int i = 0; i < objects.length; i++) {
			System.out.println("Выполняет " + objects[i].getClass().getSimpleName());
			for (int j = 0; j < events.length; j++) {
				System.out.println("Пробует " + events[j].getClass().getSimpleName());
				if (objects[i] instanceof Human) {
					if (events[j] instanceof Wall) {
						if (((Human) objects[i]).jump(((Wall) events[j]).wallHeight)) {
							System.out.println("Смог");
						} else {
							System.out.println("Не Смог");
							break;
						}
					} else {
						if (((Human) objects[i]).run(((Track) events[j]).trackLength)) {
							System.out.println("Смог");
						} else {
							System.out.println("Не Смог");
							break;
						}
					}
					} else if (objects[i] instanceof Cat)  {
					if (events[j] instanceof Wall) {
						if (((Cat) objects[i]).jump(((Wall) events[j]).wallHeight)) {
							System.out.println("Смог");
						} else {
							System.out.println("Не Смог");
							break;
						}
					} else {
						if (((Cat) objects[i]).run(((Track) events[j]).trackLength)) {
							System.out.println("Смог");
						} else {
							System.out.println("Не Смог");
							break;
						}
					}
				} else if (objects[i] instanceof Robot)  {
					if (events[j] instanceof Wall) {
						if (((Robot) objects[i]).jump(((Wall) events[j]).wallHeight)) {
							System.out.println("Смог");
						} else {
							System.out.println("Не Смог");
							break;
						}
					} else {
						if (((Robot) objects[i]).run(((Track) events[j]).trackLength)) {
							System.out.println("Смог");
						} else {
							System.out.println("Не Смог");
							break;
						}
					}
				}
			}
		}
	}
}


