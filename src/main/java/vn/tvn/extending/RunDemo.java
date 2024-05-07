package vn.tvn.extending;

import java.time.LocalDate;

public class RunDemo {
    public static void main(String[] args) {
        Student student = new Student("Huyen", "123 Ngô Gia Tự",
                LocalDate.now(), "0932042042", "Java");

        Employee employee = new Employee("Gao Gao","123 Thành Thái",
                LocalDate.now(),"0932042712", "teacher");

        //student.printInfo();
        student.getInfo();

        CollegeStudent collegeStudent = new CollegeStudent("Hihi","123 Hoà Hoả",
                LocalDate.now(),"0932042713","Java1","711");

        collegeStudent.extSub();//cái này cha hoặc ông nội public ra thì con, cháu đều dùng đc
        collegeStudent.printInfo();
        collegeStudent.getInfo();

        employee.sameNameVariable();
    }
}
