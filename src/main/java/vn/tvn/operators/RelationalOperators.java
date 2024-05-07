package vn.tvn.operators;

public class RelationalOperators {
    // <, <=, >, >=, ==, !=  ==> toán tử này là so sánh, nên sẽ trả về dạng boolean (true/false)

    public void demoRelationalOperators(){
        int a = 100;
        int b = 100;

        boolean result = a < b; /// --> result = false
        boolean result1 = a <= b; // --> result1 = true

        boolean result2 = a >= b; // --> result2 = true
        boolean result3 = a > b; // --> result3 = false

        boolean result4 = a == b; // --> result4 = true

        //so sánh a khác b hay ko
        boolean result5 = a != b; // --> result5 = false
    }

    // BT ==> 5phut, viết method, kiểm tra 1 số có phải là số chắn ko?
    // ==> return?, parameter?

    public boolean isOldNumber(int a){
        // lấy số dư
        int per = a % 2;
        //So sánh số dư đó
        boolean result = per == 0;
        // Trả về kết quả
        return result;
    }

    public boolean checkNumber(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        RelationalOperators relationalOperators = new RelationalOperators();
        relationalOperators.demoRelationalOperators();
        System.out.println(relationalOperators.checkNumber(99));
    }
}
