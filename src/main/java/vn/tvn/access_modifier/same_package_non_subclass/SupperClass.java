package vn.tvn.access_modifier.same_package_non_subclass;

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
