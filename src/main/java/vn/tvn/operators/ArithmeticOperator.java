package vn.tvn.operators;

public class ArithmeticOperator {

    // +, -, *, / (chia lấy phần nguyên), % (chia lấy phần dư)

    public void demoArithmeticOperator(){
        int a = 10;
        int b = 20;
        int sum = a + b; // sum ==> 30
        int sub = a - b; // sub ==> -10
        int mul = a * b; // mul ==> 200

        int div = b / a; // div = 2
        int percent = 25 % a; // per ==> 5 (lấy số dư)

        // BT: Cho 1 số trong khoảng 0 -> 100.
        // Tính tổng các số của số đó
        // ex: 99 --> 9 + 9 = 18
        // Viết method? 10ph
    }

    public static int getSumAllNumber(int number){
        int firstNumber = number % 10;
        int reaminingNumber = number / 10;
        int secondNumber = reaminingNumber % 10;
        reaminingNumber = reaminingNumber /10;
        int thirdNumber = reaminingNumber % 10;
        return firstNumber + secondNumber + thirdNumber;
    }

    public static void main(String[] args) {
        int result = getSumAllNumber(55);
        System.out.println(result);
    }
}
