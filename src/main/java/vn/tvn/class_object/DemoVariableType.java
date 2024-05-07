package vn.tvn.class_object;

public class DemoVariableType {
    //Đối vs trường hợp static, khi chạy hàm Main sẽ chạy thẳng luôn
    //Đối vs instance thì cần new Object

    public static void main(String[] args) {
        var sta = VariableType.staticVariable;
        VariableType variableType = new VariableType();

    }
}
