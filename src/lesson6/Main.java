package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(150, 5.0, 0);
        Animal dog = new Dog(300, 1.5 , 5);
        cat.printInfo();
        System.out.println(cat.run(cat.maxSpeed));
        System.out.println(cat.jumpOver(cat.maxJump));
        System.out.println(cat.swim(cat.maxSwim));
        dog.printInfo();
        System.out.println(dog.run(dog.maxSpeed));
        System.out.println(dog.jumpOver(dog.maxJump));
        System.out.println(dog.swim(dog.maxSwim));

    }
}
