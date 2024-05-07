package vn.tvn.access_modifier.diff_package_non_sub_class.sub;

import vn.tvn.access_modifier.diff_package_non_sub_class.supper.SupperClass_4;

public class NonSubDiffPackage {

    public void callAllMethods(){
        SupperClass_4 supperClass_4 = new SupperClass_4();

        supperClass_4.publicMethod();
        //protectedMethod(); --> ko dùng đc
        //privateMethod();--> ko dùng đc
        //defaultMethod();--> ko dùng đc
    }
}
