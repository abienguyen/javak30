package vn.tvn.access_modifier.same_class;

public class DemoSameClass {
    //default method là ko có keyword nào
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

    public void usingAllMethod(){
        defaultMethod();
        privateMethod();
        protectedMethod();
        publicMethod();
    }

    public static void main(String[] args) {
        DemoSameClass demoSameClass = new DemoSameClass();

        demoSameClass.defaultMethod();
        demoSameClass.protectedMethod();
        demoSameClass.publicMethod();
        demoSameClass.privateMethod();
    }
}
