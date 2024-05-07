package vn.tvn.extending;

import java.time.LocalDate;

public class Employee extends Person {
//    private String name;
//    private String address;
//    private LocalDate birthday;
//    private String phone;
      private String job;
      int weight = 200; // -> instance

      public Employee(String name, String address, LocalDate birthday, String phone, String job) {
            super(name, address, birthday, phone);// muốn kế thừa contructor thì fai dùng clazz
            this.job = job;
      }

      public void getInfo(){
            printInfo();
            System.out.println(job);
      }

      public void sameNameVariable(){
            int weight = 100; // -> này là local
            System.out.println(weight);// ưu tiên lấy biến local trc
            System.out.println(this.weight);// lấy instance thuộc class chính nó
            System.out.println(super.weight);// lấy instance ko thuộc class nó
      }
}
