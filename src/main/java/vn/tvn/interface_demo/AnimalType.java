package vn.tvn.interface_demo;

public class AnimalType {

    public Animal getAnimal(String type){
        switch (type){
            case "pig":
                return new Pig();
            case "dog":
                return new Dog();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
