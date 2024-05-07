package vn.tvn.selection_decisions;

import vn.tvn.java.calculator.Calculator;

public class CallMethodMyLib {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        var data = calculator.sum(10,30,20);
        System.out.println(data);
    }
}
