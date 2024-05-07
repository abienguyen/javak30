package vn.tvn.access_modifier.diff_package_sub_class.sub;

import vn.tvn.access_modifier.diff_package_sub_class.supper.SupperClass;

public class SubClassDiffPackage extends SupperClass {

    public void callAllMethods(){
        publicMethod();
        protectedMethod();// khác package và có kế thừa thì dùng đc protected, ko kế thừa thì ko dùng đc
        //defaultMehotd(); --> ko dùng đc
        //privateMethod(); --> ko dùng đc
    }
}
