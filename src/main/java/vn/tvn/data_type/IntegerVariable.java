package vn.tvn.data_type;

public class IntegerVariable {
    public void innit(){
        // có 4 loại: byte, short, int, long
        byte age = 30; //(min-128, max 127) là 1 số nguyên, lưu trữ những biến ko quá > 128 (tốn ram 8bits), byte default = 0, ko có null
        short age2 = 10; //(min -32k, max 32k)
        int age3 = 30;
        long age5 = 40;

        byte compareValue = 40;

        Byte object = Byte.valueOf(age); //convert byte(nhỏ) data_type sang Byte (lớn) Object
        Byte.compare(age,compareValue);
        int result = Byte.compare(age, compareValue);
        // 0 -> age = compareValue
        // age - compareValue = result; ==> <0 là age < compareValue
        // age - compareValue = result; ==> >0 là age > compareValue

        Integer objectInt = 100;

        //BTVN
        //Dùng Byte.
        //Dùng object.
        //method dùng làm gì
        //method trả về giá trị gì
        //method cần parameters gì
    }
}
