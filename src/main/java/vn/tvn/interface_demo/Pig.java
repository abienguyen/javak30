package vn.tvn.interface_demo;

public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Pig: ec ec");
    }

    @Override
    public void sleep() {
        System.out.println("Pig: zu zu");

    }
}
