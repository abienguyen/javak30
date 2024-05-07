package vn.tvn.class_object;

public class Address {
    //nên viết print chính trên class đối tuọng đó mới hợp lý
    private String add;
    private String ward;
    private String district;
    private String city;

    public Address(String add, String ward, String district, String city) {
        this.add = add;
        this.ward = ward;
        this.district = district;
        this.city = city;
    }

    //Có thể tạo 1 class khác trong cùng 1 class => nhưng nên tạo riêng ngoài cho rõ ràng
    public static class Clazz11 {

    }
    public void printInfo(){
        System.out.println("===== " + add);
        System.out.println("===== " + ward);
        System.out.println("===== " + district);
        System.out.println("===== " + city);
    }
}
