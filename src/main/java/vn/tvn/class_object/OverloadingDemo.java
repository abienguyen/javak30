package vn.tvn.class_object;

public class OverloadingDemo {
    //Trùng tên, khác parameter và khác số lượng parameter gọi là overloading

    //overloading constructor

    //overloading method
    public int add(int n1, int n2){
        return n1 + n2;
    }
    //khác số lượng parameter
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    //khác data_type
    public float add(int n1, float n2){
        return n1 + n2;
    }
    public float add(float n1, int n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();
        demo.add(13, 14f);
        demo.add(12f,14);
        demo.add(13,14,1,15,13,12);
    }
    public int add(int... number){
        //int... đang hiểu là 1 array
        //vẫn khai báo đc thêm parameter khác, sẽ khai báo ngược lại, vd (int c, int...number)
        int b = 0;
        for(int a : number){
            b = b + a;
        }
        return b;

    }
}
