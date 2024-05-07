package vn.tvn.access_modifier.same_package_non_subclass;


//Ko có kế thừa
public class NonSubClass {

    public void callAllMethod(){
        SupperClass supperClass = new SupperClass();

        supperClass.defaultMethod();
        supperClass.protectedMethod();
        supperClass.publicMethod();
        //supperClass.privateMethod(); --> ko dùng thừa
    }
}
