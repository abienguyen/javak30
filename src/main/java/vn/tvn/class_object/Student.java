package vn.tvn.class_object;

import org.apache.commons.lang3.StringUtils;

public class Student {

    static String staticValue = "a";
    //Class là để generate ra 1 đối tượng (Object)
    //Đòi hỏi thuộc tính (fields) của Class đó

    //Class java có 3 phần chính:
    //fields => Đây là thuộc tính cần quản lý của Sudent
    private String name;
    private String clazz;
    private String phone;
    private Address address;
    // public so thể truy suất ko cần fai có hàm getter hoặc setter, sử dụng đc ngoài class
    public String publicField;

    //constructor => syntax luôn là public và tên luôn trùng vs Class
    //luôn luôn có constructor
    //nó sẽ tự biên dịch nếu ko khai báo => lúc này sẽ là constructor empty
    //có 1 or nhiều constructor
    public Student(String name, String s) {
        //this.name => name là giá trị ở private
        //name => là giá trị local, trong parameter
        this.name = name;
    }

    public Student(String name, String clazz, String phone, Address address) {
        this.name = name;
        this.clazz = clazz;
        this.phone = phone;
        this.address = address;
    }

    // methods
    // Hàm printInfo này phục vụ cho các Object đc tạo ra trong class Student
    // Tất cả đối tượng Student đều sử dụng
    // printInfo là method support cho những data_types
    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("clazz: " + clazz);
        System.out.println("phone: " + phone);
        //System.out.println("address: " + address);
        address.printInfo();
    }
    //getName lấy thông tin Name
    public String getName(){
        if(StringUtils.equals(name,"Thinh")){
            return "hidden";
        }
         return name;
    }
    public String getClazz() {
        return clazz;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //lấy giá trị của biến phone (trong parameter), đưa vào phone (sau dấu =), và gán cho phone (ở this.phone)
    public void setPhone(String phone){
        if (!(phone.length() == 10)){
            throw new IllegalArgumentException("invalid phone");
        }
        this.phone = phone;

    }

    public static void methodStatic(){
        System.out.println("call static");
    }
    // tại sao phải sử dụng setter vs getter
    //private chỉ dùng đc trong class => nên dùng private, ko nên dùng public
    //khi dùng private thì fai dùng getter hoặc setter, để truy suất
}
