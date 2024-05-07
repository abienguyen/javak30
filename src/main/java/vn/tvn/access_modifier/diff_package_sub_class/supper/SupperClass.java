package vn.tvn.access_modifier.diff_package_sub_class.supper;

public class SupperClass {
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
