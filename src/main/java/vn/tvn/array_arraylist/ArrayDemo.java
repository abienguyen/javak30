package vn.tvn.array_arraylist;

import vn.tvn.class_object.Student;

public class ArrayDemo {

    public void initialize(){
        //ít dùng, chỉ dùng khi biết gía trị nó ko thay đổi, vd: 1 tuần có 7 ngày, ko thay
        //Dạng này thì cần khai báo giá trị
        //syntax
        String[] carNames = new String[5]; //String[5] nghĩa là carNames chứa 5 giá trị
        int[] numbers = new int[3]; //syntax kiểu dữ liệu vd int[] variable_name = new int[] (kiểu dữ liệu)
        Student[] students = new Student[4];
        //fix length ko thay đổi, từ lúc tạo ra tới lúc kết thúc

        //set/add/update data in array - ko theo thứ cái nào add trước sẽ vô index trước
        //update cái mới sẽ đè lên giá trị cũ
        carNames[0] = "Volvo";
        carNames[1] = "BMW";
        carNames[0] = "Volvo2";
        carNames[0] = "";

        // Tự set giá trị vào cars, và sẽ có list này luôn
        String[] cars = {"Volvo", "BMW", "Ford"};
    }

    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.initialize();
    }
}
