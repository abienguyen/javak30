package vn.tvn.class_object;

public class VariableType {
    //Kiểu của biến, có 3 loại: static, instance, local
    //Biến local chỉ tồn tại trong method, ko dùng đc cho method khác
    //Biến instance chỉ tồn tại trong class
    //Biến static sẽ khởi tạo khi chạy project
    private String instanceVariable = "instanceVariable";
    public static String staticVariable = "staticVariable";

    public void demoLocalVariable(){
        String localVariable = "localVariable";
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
        System.out.println(localVariable);
    }

    public void demoLocalVariable2(){
        String localVariable = "localVariable";
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
        System.out.println(localVariable);
    }
}
//Tức là 3 dòng này về bản chất nó đều gọi là biến instance
//public, private, default, protected chỉ là các từ khóa để phân biệt phạm vi truy cập đúng không anh?
//    String variable = "variable";
//    private String name;
//    public String instanceVariable = "instanceVariable";
