package vn.tvn.practice;

import org.apache.commons.lang3.StringUtils;

import static java.lang.System.out;

public class BaiTapVN2 {
    //BT tự làm

    //Câu 1: Hãy viết 2 methods in ra
    // - vị trí đầu tiên
    // - vị trí cuối cùng
    //của 1 ký tự cần tìm trong 1 chuỗi bất kỳ.
    //Ví dụ: Cho 1 chuỗi:  I go to school, cần tìm ký tự "o"

    public static String intFirstcharacter(String result) {
        //String result = new String("I go to school");
        System.out.println(result.indexOf('o'));
        System.out.println(result.lastIndexOf('o'));
        return result;
    }


    //Câu 2: Viết method với parameter là 1 chuỗi . Cần remove all ký tự đặt biệt trong chuỗi đó
    // và trả về chuỗi ko có ký tự đặt biệt.
    //-- ex data: dsskfh#$2839&&635!!228e~~++(
    //-- Nâng cao: Google Scanner trong java, nhập bất kì chuỗi ký tự nào từ màn hình console.
    // In ra kết quả ko có kí tự đặt biệt.

    public String removeSpecialCharacters(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "");
    }

    //Câu 3: Write a java method to compare two String and return boolean
    //Ex data input
    //String a = "test java" vs String b = null
    //String c = null vs String d = "test java"
    //Research google về StringUtils, Objects, String  để viết 3 method khác nhau. --> cái nào nên dùng
    public static boolean compareString(String a, String b) {
        if (a != null) {
            a.equals(b);
        } else if (b == null) {
            return true;
        } else {
            return false;
        }
        return a.equals(b);
    }

    public static void compareString1() {
        String a = "test java";
        String b = null;
        String c = null;
        String d = new String("test java");
       /* System.out.println(a.equals(b));
        System.out.println(a == c);*/
        out.println("StringUtils result: " + "a: " + StringUtils.isEmpty(a) + " b: " + StringUtils.isEmpty(a) + " c: " + StringUtils.isEmpty(c));
        out.println("StringUtils result: " + "a: " + StringUtils.isBlank(a) + " b: " + StringUtils.isBlank(a) + " c: " + StringUtils.isBlank(c));
    }


    //Câu 4:Viết hàm replace all số có trong chuỗi đã cho. Trả về chuỗi ko có số.
    public String removeNumber(String text) {
        return text.replaceAll("[0-9]", "");
    }

    //Sửa BT - sử dụng regex101.com
    public static String replaceNumber(String s) {
        var result =
                s.replaceAll("\\d", "");

        var number = s.length();
        return result;


        //var là giá trị đc đại diện cho những data_type mình trả về, có thể là 1 int, 1 float, 1 string
        //Nếu var màu đỏ thì cần set lại language chọn cái có 10
    };

    public static void main(String[] args) {
        BaiTapVN2 bt = new BaiTapVN2();
       /* System.out.println(bt.removeSpecialCharacters("dsskfh#$2839&&635!!228e~~++("));
        System.out.println(bt.removeNumber("dsskfh#$2839&&635!!228e~~++("));
        System.out.println(bt.compareString("test java", null));
        System.out.println(bt.compareString(null, "test java"));
        System.out.println(bt.compareString(null, null));*/
        //intFirstcharacter();
        compareString1();
        //Sửa BT
        String a = replaceNumber("âfdfdsf 11324 ");
        System.out.println(a);
    }
}



