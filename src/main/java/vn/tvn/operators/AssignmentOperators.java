package vn.tvn.operators;

public class AssignmentOperators {
    // +=, -+, *=, /=, %=, =

    public void demoAssigmentOperators(){
        int a = 100;
        int b = 30;

        a = a + b; // ==> 130
        a += b; // ==> a = 130 (a + b sau đó gán kết quả lại cho a)

        int c = 10;
        int d = 3;
        // c = c -d; // ==> c = 7
        c -= d; // ==> c = 7

        int e = 10;
        int f = 3;
        e %=f; // e = 1;
        // <=> e = e %f;
    }
}
