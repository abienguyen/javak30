package vn.tvn.how_to_call_method;

public class CallMethodSameClass {
    public static void main(String[] args) {
        callIntroducedMethod();
    }
    public static void callIntroducedMethod(){
        System.out.println("Hello");
        introduce();
    }
    // method <=> function
    public static void introduce(){
        System.out.println("Huyen");
        System.out.println("JavaK30");
    }
}
