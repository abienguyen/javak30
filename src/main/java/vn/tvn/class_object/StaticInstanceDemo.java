package vn.tvn.class_object;

public class StaticInstanceDemo {
    //ko thuộc contructor và ko thuộc method => thì dùng Instance
    //Khởi tạo từ hàm Main
    //Đoạn code trong Class chạy:
    //static run (build trc, hoàn thành trc) > main run (chạy method trong main, nếu có instance sẽ chạy trc, rồi mới tới các method khác) > instance run > contructor run

    //instance init
    {
        System.out.println("instance run");
    }

    //Static
    static {
        System.out.println("Static run");
    }

    //constructor
    public StaticInstanceDemo(){
        System.out.println("constructor run");
    }

    public static void main(String[] args) {
        System.out.println("Main run");
        StaticInstanceDemo contructor = new StaticInstanceDemo();
    }
}
