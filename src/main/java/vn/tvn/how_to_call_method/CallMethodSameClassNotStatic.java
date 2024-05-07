package vn.tvn.how_to_call_method;

public class CallMethodSameClassNotStatic {
    public static void main(String[] args) {
        CallMethodSameClassNotStatic callMethodSameClassNotStatic = new CallMethodSameClassNotStatic();
        callMethodSameClassNotStatic.callIntroducedMethod();
    }
    public static void callIntroducedMethod(){
        System.out.println("Hello");
        introduce();
    }
    // method <=> function
    //Trong java chỉ có 1 hàm Main để chạy Class
    //Call cùng Class:
    //Có 2 cách:
    //- Dùng static đồng bộ vs hàm Main
    //- Tạo new Object của class muốn chạy

    //Call khác Class:
    //- Muốn chạy hàm nào thì tạo new Object của Class đó (ko dùng static)
    //- Nếu dùng Static thì ko cần tạo new Object, chỉ cần dùng tên class chứa hàm muốn chạy (tên class.tên method)

    public static void introduce(){
        System.out.println("Huyen");
        System.out.println("JavaK30");
    }
}
