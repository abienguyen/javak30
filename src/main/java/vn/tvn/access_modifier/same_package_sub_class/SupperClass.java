package vn.tvn.access_modifier.same_package_sub_class;

public class SupperClass {

    //access modifer là phạm vi sửa đổi truy cập
    //1. Default Access Modifier - Công cụ sửa đổi truy cập mặc định
    //2. Private Access Modifier - Công cụ sửa đổi truy cập riêng tư
    //4. Public Access Modifier - Công cụ sửa đổi truy cập công cộng
    //5. Protected Access Modifier - Bảo vệ truy cập sửa đổi
    void defaultMethod(){
        System.out.println("default Method");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }

    protected void protectedMethod(){
        System.out.println("protected Method");
    }

    public void publicMethod(){
        System.out.println("public Method");
    }
}
