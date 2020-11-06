package lesson7;

public class Plate {
    private int food;
    private int capacity;

    public Plate(int capacity, int food) {
        this.food = food;
        this.capacity = capacity;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        this.food -= n;
    }

    public void addFood(int n) {
        this.food += n;
    }

    public void printInfo() {
        System.out.println("Capacity of plate: " + capacity);
        System.out.println("Food in plate: " + food);
        System.out.println();
    }
}
