package lesson7;

import java.util.Random;

public class Main {
    static Random random = new Random();
    static Cat[] cats = new Cat[2];
    static Plate[] plates = new Plate[4];
    static FoodTime foodTime = new FoodTime();

    public static void main(String[] args) {
        createCats();
        createPlates();
        foodTime.allowCatsEatFood(cats, plates);
        for (Cat kot : cats) {
            kot.printInfo();
        }
        for (Plate plat : plates) {
            plat.printInfo();
        }
    }

    static public void createCats() {
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + i, random.nextInt(10 - 1) + 1);
            cats[i].printInfo();
        }
    }

    static public void createPlates() {
        for (int i = 0; i < plates.length; i++) {
            int capacity = random.nextInt(10 - 1) + 1;
            plates[i] = new Plate(capacity, random.nextInt(capacity));
            plates[i].printInfo();
        }
    }


}

//Возвращать резульаты методов в масивы, и потом их использовать.