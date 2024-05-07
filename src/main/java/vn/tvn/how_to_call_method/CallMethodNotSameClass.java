package vn.tvn.how_to_call_method;

public class CallMethodNotSameClass {
    public static void main(String[] args) {
        callIntroducedMethod();
        DefaultMethod.introduceStatic();
    }
    public static void callIntroducedMethod() {
        System.out.println("Hello");
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.introduce();
    }
}

