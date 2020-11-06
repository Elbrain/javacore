package lesson6;

public class Cat extends Animal {
    protected final int SPEEDLIMIT = 200;
    protected final int JUMPLIMIT = 2;
    protected final int SWIMLIMIT= 0;

    public Cat(int maxSpeed, double maxJump, int maxSwim) {
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
        System.out.print("Кот не умеет плавать. Результат - ");
        return false;
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
