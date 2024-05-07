package vn.tvn.how_to_define_method;

public class MethodDefine {

    // modifer (public, private, protected, default)
    public void methodNoParamterNoReturn(){
        // dùng void nếu ko muốn trả về giá trị kết quả
        // dùng ở đây như là hardcode
        int number1 = 100;
        int number2 = 200;
        int sum = number1 + number2;
        System.out.println("methodNoParamterNoReturn");

    }

    public void methodHasParameterAndNoReturn(int number1, int number2){
        // thong dung hơn, có thể thay đổi giá trị
        // hạn chế ko viết quá nhiều paramter trong method, nên là max 5 parameter
        int sum = number1 + number2;
        System.out.println(sum);

    }

    public int methodHasParameterAndReturn(int number1, int number2){
        // thay void bằng data_type mà muốn trả về
        int sum = number1 + number2;
        return sum;
    }

    public static void main(String[] args) {
        MethodDefine methodDefine = new MethodDefine();
        int s = methodDefine.methodHasParameterAndReturn(100, 200);
    }
}
