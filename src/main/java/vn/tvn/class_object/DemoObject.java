package vn.tvn.class_object;

public class DemoObject {


    public static void main(String[] args) {
        //Student là Class
        //thinh/thanh là Object => là 1 đối tượng cụ thể param
        //Object đc tạo từ Class thông qua Constructor
        //Object là 1 giá trị cụ thể nào đó, Class giống như là 1 template tạo ra Object
        Student thinh = new Student("Thinh", "0909090909");
        Student thanh = new Student("Thanh","0909090909");

        Student.methodStatic();

        //lấy name trong object thinh
        //Viết method để lấy thông tin trong Object

        var name = thinh.getName();
        System.out.println(name);

        //update thông tin thì làm ntn
        thinh.setPhone("0122434354");
        //thinh.setAddress("123 Ngô Gia Tự");
        thinh.setClazz("Java for Tester");

        //sout chỉ in đc text => ko nên print Object
        System.out.println(thanh);
        System.out.println(thinh);

        thanh.printInfo(); //printInfo cho đối tượng
        thinh.printInfo();

        //khai báo 1 object mới khi class là 1 Object
        Address anAddress = new Address("123 Ngô Gia Tự","P2","Q10","HCM");

        Student anFullInfo = new Student("An An",
                "java","0134234", anAddress);

        System.out.println("DONE");
    }
}
