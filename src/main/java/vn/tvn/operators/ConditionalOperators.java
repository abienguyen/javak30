package vn.tvn.operators;

public class ConditionalOperators {
    // ? :
    // (biểu thức) ? giá trị 1 : giá trị 2
    // Hỏi biểu thức phía trước có đúng hay ko, nếu đúng trả giá trị 1, ko đúng trả giá trị 2

    public static void demoConditionalOperators(){
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println(max);
    }

    public static void main(String[] args) {
        demoConditionalOperators();
        System.out.println(max(50, 20));
    }

    // Viết method lấy giá trị max của 2 số, áp dụng biểu thức trên

    public static int max(int a, int b){
        return (a > b)? a : b;
    }
}
