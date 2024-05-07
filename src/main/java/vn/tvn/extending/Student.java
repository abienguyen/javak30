package vn.tvn.extending;

import java.time.LocalDate;

public class Student extends Person{
//    private String name;
//    private String address;
//    private LocalDate birthday;
//    private String phone;
    private String clazz;


    public Student(String name, String address,
                   LocalDate birthday, String phone, String clazz) {
        super(name, address, birthday, phone);
        this.clazz = clazz;
    }

    public void getInfo(){
        printInfo();
        System.out.println(clazz);
    }

    @Override //custom lại cho phù hợp vs từng đối tượng
    public void printInfo(){
        super.printInfo();
        System.out.println(clazz);
    }
}

