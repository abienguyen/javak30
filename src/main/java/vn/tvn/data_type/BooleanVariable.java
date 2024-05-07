package vn.tvn.data_type;

public class BooleanVariable {
    //syntax
    public void initBooleanVariable(){
        // data_type (boolean) variable_name = init_value
        boolean isChecked = true;
        boolean hasModified = false;
        // => chi co 2 giai tri (true/false)

        // Class Boolean
        Boolean isClassBoolean = true;
        // => co 3 gia tri (null, true, false)
        isClassBoolean.toString();
        isClassBoolean.booleanValue();
        // isClassBoolean => Object
    }
    public void usingBooleanVariable(){
        // dung de lam gi => dung de check dieu kien nao do
        boolean isChecked = true;
        if (isChecked) {
            System.out.println("isChecked = true");
        } else {
            System.out.println("isChecked = false");
        }

    }
}
