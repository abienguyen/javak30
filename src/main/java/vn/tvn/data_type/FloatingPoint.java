package vn.tvn.data_type;

public class FloatingPoint {
    public static void init(){
        // có 2 kiểu để ko hiểu là double, 32bits
        float a = 15.3f;
        float b =(float)14.3;

        double d = 111.22; // lưu 64bits

        double result = Double.parseDouble("131313"); //parse từ String sang double
        double c = Double.min(a,b);

        Double dObject = 100.00;
        dObject.byteValue();
        String s = Float.toString(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        init();
        getDienTichHinhChuNhat();
    }

    // bai tap: 10ph
    // Write method tinh dt dien tinh hinh chu nhat có dai & rong

    public static void getDienTichHinhChuNhat(){
        float dai = 10.5f;
        float rong = 20.2f;
        float dientich = dai * rong;
        System.out.println(dientich);
    }
}
