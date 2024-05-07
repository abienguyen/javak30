package vn.tvn.data_type;

import java.time.LocalDate;

public class StringVariable {
    // String là 1 chuỗi data

    public void innit(){
        // direct way
        String name = "Huyen Nguyen";

        // constructor -> thường sẽ bỏ qua bước này cho đơn giản
        String name2 = new String ("Huyen Nguyen");
    }

    // some method String support

    public static void someMethod(){
        // length
        // muốn tìm độ dài của chuỗi
        String text = "Log in to Jira, Confluence, and all other Atlassian Cloud products here. Not an Atlassian user? Sign up for free.";
        int len = text.length();
        System.out.println(len);

        // muốn nối 2 chuỗi lại
        String text2 = "hello ";
        String text3 = "world";

        // sử dụng dấu + operator
        String full = text2 + text3;
        // sử dụng concat
        String fullText = text2.concat(text3);
        System.out.println(fullText);

        //format
        // Đơn hàng xxxx có giá trị yyyyy
        // Search gg hướng dẫn sử dụng String format https://gpcoder.com/2352-huong-dan-su-dung-string-format-trong-java/
        String alert = "Đơn hàng %s có giá trị %d được giao vào ngày %tD";
        LocalDate localDate = LocalDate.now();
        String fullAlert = String.format(alert,"12345", 1234556, localDate );
        System.out.println(fullAlert);

        // cắt chuỗi
        String subtext = text.substring(0,10);
        System.out.println(subtext);

        // thay thế
        String replaceString = text.replace("o","0");
        System.out.println(replaceString);

    }
    public static void compareString(String location){
        boolean a = location == "HN"; // ko nên dùng nếu là Object, vì nó sẽ lấy nguyên Obj ra compare, chỉ nên dùng compare số
        boolean b = location.equals("HN"); //phải dùng, vì chỉ lấy biến ra compare
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        //someMethod();
        String value = new String("HN");
        compareString("HN");
    }
}
