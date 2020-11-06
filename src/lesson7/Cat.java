package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate[] plate, int j) {
        plate[j].decreaseFood(appetite);
        this.appetite = 0;
        this.satiety = true;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ". satiety=" + satiety +
                '}';
    }

    public void printInfo() {
        System.out.println("Cat - " + this);
    }
}
