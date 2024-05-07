package vn.tvn.exception;

// Có 2 loại exception: runtime (khi chạy mới xuất exception ra), built in (có sẵn exception)

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DemoExceptionBasic {

    public void readFile(String path){
        try {
            InputStream input = new FileInputStream(path);//sợ file đường dẫn (path) ko đúng, nên dùng FileNotFoundException
        } catch (FileNotFoundException e) {
            e.printStackTrace();//ctrinh vẫn chạy nếu có catch, ko có sẽ dừng ctrinh luôn
        }
    }

    //Null Point rất hay gặp trong Java
    public void demoNullPointException(){
        try{
            String str = null;
            str.equals("");
        } catch (NullPointerException e){
            System.out.println(e.getMessage());// e là value của exception
        }
    }

    public void demoArrayIndexOutOfBoundsException(){
        try{
            String[] a = new String[3];
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public void multiCatchException(){
        try{
            int a = 10 / 0;
        } catch (NullPointerException e){
            System.out.println("Not null");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong index");
        } catch (ArithmeticException e){
            System.out.println("div 0");
        }
    }

    //throws này là có gì là ném ra lỗi cái đó, ko quan tâm hàm ngoài xử lý ntn
    public void demoThrowException() throws NullPointerException{
        String str = null;
        str.equals("");
    }

    public void demoThrowNewException(String str){
        if (StringUtils.isBlank(str)){
            throw new IllegalArgumentException("Giá trị ko đc empty");
        }
        System.out.println(str.length());

    }


    public static void main(String[] args) {
        try{
            DemoExceptionBasic demo = new DemoExceptionBasic();
            demo.demoNullPointException();
            System.out.println("Done");
            demo.readFile("");
            demo.demoArrayIndexOutOfBoundsException();
            demo.multiCatchException();
            //demo.demoThrowException();
            demo.demoThrowNewException(null);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
