package vn.tvn.interface_demo;

public class Dog implements Animal{
    //fai dùng @Override, và khai báo cùng method vs interface mà implements cùng
    @Override
    public void animalSound() {
        System.out.println("Dog: gau gau");

    }

    @Override
    public void sleep() {
        System.out.println("Dog: huz go");
    }

    //abstract
}
