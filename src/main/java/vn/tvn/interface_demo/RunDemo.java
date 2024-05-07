package vn.tvn.interface_demo;

public class RunDemo {
    public static void main(String[] args) {
        AnimalType animalType = new AnimalType();
        var animal = animalType.getAnimal("dog");
        animal.animalSound();
        animal.sleep();

       /* Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();

        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();*/
    }
}
