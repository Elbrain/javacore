package lesson7;

public class FoodTime {
 public void allowCatsEatFood(Cat[] cats, Plate[] plates) {
     for (Cat cat : cats) {
         for (int j = 0; j < plates.length; j++) {
             if (plates[j].getFood() >= cat.getAppetite()) {
                 cat.eat(plates, j);
             } else {
                 cat.setAppetite(cat.getAppetite() - plates[j].getFood());
                 plates[j].setFood(0);
             }
         }
     }
    }
}
