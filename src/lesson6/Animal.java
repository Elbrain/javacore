package lesson6;

public abstract class Animal {
    protected int maxSpeed;
    protected double maxJump;
    protected int maxSwim;

    public Animal(int maxSpeed, double maxJump, int maxSwim){
        this.maxSpeed = maxSpeed;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public abstract boolean run(int distance);

    public abstract boolean swim (int distance);

    public abstract boolean jumpOver(double height);

    public void printInfo(){
        System.out.println(this);
    }

    public String toString(){
        return  this.getClass().getSimpleName() + " {" +
        "Бег: " + maxSpeed +
        "; Высота прыжка: " + maxJump +
        "; Плавание: "  + maxSwim +
                "}";
    }
}
/*    Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
        В качестве параметра каждому методу передается величина, означающая или длину препятствия
        (для бега и плавания), или высоту (для прыжков).*/
