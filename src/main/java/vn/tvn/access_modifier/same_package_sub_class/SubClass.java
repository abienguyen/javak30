package vn.tvn.access_modifier.same_package_sub_class;

//Có kế thừa
public class SubClass extends SupperClass{

    public void callAllMethod(){
        publicMethod();
        protectedMethod();
        defaultMethod();
        //privateMethod(); --> ko dùng đc ngoài class
    }
}
