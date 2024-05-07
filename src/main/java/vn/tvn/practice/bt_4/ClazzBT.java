package vn.tvn.practice.bt_4;

public class ClazzBT {
    private String name;
    private String address;
    private String departments;
    private String clazz;

    public ClazzBT(String name, String address, String departments) {
        this.name = name;
        this.address = address;
        this.departments = departments;
        this.clazz = clazz;
    }

    public void printInforClazz() {
        System.out.println("===== " + name);
        System.out.println("===== " + address);
        System.out.println("===== " + departments);
        System.out.println("===== " + clazz);
    }
}
