package vn.tvn.operators;

public class LogicalOperators {
    // && (and), || (or), ! (ngược lại) ==> true/ false

    public void demoLogicalOperators(){
        int a = 10;
        int b = 20;
        int c = 30;

        boolean result = (a > b) && (a > c); // ==> false
        // tất cả biểu thức true ==> kết quả là true
        // chỉ cần 1 biểu thức false thì stop check và kết quả là false

        boolean result2 = (a < b) || (a > c) || (c > b);
        //                  false      true
        // ==> true
        // chỉ cần 1 biều thức true là stop check -> return true
        // tất cả biểu thức false thì --> return false

        boolean result3 = !(a < b);
        //                ! false
        //             ==>  true

        boolean result4 = !result2; // result4 = false
    }
    // BT: Kiểm tra 1 employee có được đóng thuế hay ko
    // ĐK1: để đc đóng thuế: salary > 300
    // ĐK2: location: HCM, HN
    // Nếu employee là nhà có công với cách mạng thì đc miễn
    // 10 phút
    // là nhà có công CM ==> true/false

    public static boolean hasNoTax(float salary, String location, boolean isContributed){
        return (isContributed)
                || (salary > 300 &&
                (location.equals("HCM") || location.equals("HN")));
    }
    public static boolean hasTax(float salary, String location, boolean isContributed){
        return !((isContributed)
                || (salary > 300 &&
                (location.equals("HCM") || location.equals("HN"))));
    }

    public static void main(String[] args) {
        boolean result = hasNoTax(600, "HCM", true);
        System.out.println(result);
    }
}


