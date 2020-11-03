package lesson6;

public class Dog extends Animal {
    protected final int SPEEDLIMIT = 500;
    protected final double JUMPLIMIT = 0.5;
    protected final int SWIMLIMIT = 10;

    public Dog(int maxSpeed, double maxJump, int maxSwim) {
        super(maxSpeed, maxJump, maxSwim);
    }

    @Override
    public boolean run(int distance) {
        if (distance < SPEEDLIMIT){
            System.out.print("Дистанция бега " + distance + " - меньше максимально допустимой, результат - ");
            return true;
        }
        else{
            System.out.print("Дистанция бега " + distance + " - больше максимально допустимой, результат - ");
            return false;
        }
    }

    @Override
    public boolean swim(int distance) {
        if (distance < SWIMLIMIT && distance != 0){
            System.out.print("Дистанция плавания " + distance + " - меньше максимально допустимой, результат - ");
            return true;
        } else {
            System.out.print("Дистанция плавания " + distance + " - больше максимально допустимой, результат - ");
            return false;
        }
    }

    @Override
    public boolean jumpOver(double height) {
        if (height < JUMPLIMIT){
            System.out.print("Высота прыжка " + height + " - меньше максимально допустимой, результат - ");
            return true;
        }
        else {
            System.out.print("Высота прыжка " + height + " - больше максимально допустимой, результат - ");
            return false;
        }
    }
}
