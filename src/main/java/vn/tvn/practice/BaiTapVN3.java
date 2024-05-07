package vn.tvn.practice;

public class BaiTapVN3 {
    //BT tự làm

    //3.1 Viết function count có bao nhiêu từ trong 1 đoạn text nhập vào. Return về số đó.
    public static void countWord(){
        String words = "Log in to Jira, Confluence";
        int countWords = words.split("\\s+").length;
        System.out.println(countWords);
    }

    //Sửa BT 3.1

    //"" chỉ dùng khi có 1 khoảng cách => khả năng sẽ bị sai, ko nên dùng cách này
    public int countWords(String text){
        // toi di hoc
        int count = text.split("").length;
        return count;
    }
    //Nên dùng cách này \\s+ (là check space thêm dấu + là add tất cả space liên tiếp vs nhau
    public static int countWords2(String text){
        // toi di hoc
        // nên check null chỗ này dùng if else khi gọi method trong 1 object
        int count = text.split("\\s+").length;
        return count;
    }
    public static void main(String[] args) {
        //Liệt kê ra case test cho function
        String tx = "tôi đi học đây nhé";
        int count = countWords2(tx);
        String tx2 = "tôi đi   học đây nhé";
        int count2 = countWords2(tx2);
        String tx3 = null;
        int count3 = countWords2(tx3);

        for (String word : tx.split("\\s+")){
            System.out.println(count);
        }

        //countWord();

        BaiTapVN3 input = new BaiTapVN3();
        boolean result = input.inputNumber(12, 13, 14, 15, 26);
        System.out.println(result);

    }
    

//3.2. Viết function có nhiều số nhập vào, chỉ cần có 1 số lẻ là trả về true, ngược lại trả về false

    public boolean inputNumber(int... a) {
        for(int i=0; i<a.length;i++){
            if (a[i] % 2 != 0){
                return true;}}
        return false;
    }


    //4.2 Dựa theo 4.1 viết 1 method để trả về điểm trung bình của sinh viên

    //4.3 Tiếp theo bài số 4.2 viết 1 method để trả về xếp loại của sinh viên
}
