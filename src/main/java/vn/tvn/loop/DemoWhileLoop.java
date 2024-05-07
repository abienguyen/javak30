package vn.tvn.loop;

public class DemoWhileLoop {

    //khi dùng while lưu ý fai có i++, nếu ko sẽ chạy wai
    //While sẽ kiểm tra dk trước khi thực thi
    public void whileDemo(int n) {
        int i = 0;
        while (i < n) {
            System.out.println("Giá trị : " + i);
            i++;
        }
    }

    //Do While sẽ thực thi trước khi ktra điều kiện
    // Khi cần ktra có giá trị trước thì nên dùng DO While, vd như query DB
    public void doWhileDemo(int n){
        int i = 0;
        do {
            System.out.println("Giá trị i: " + i);
            i++;
        } while (i < n);

    }

    public static void main(String[] args) {
        DemoWhileLoop demoWhileLoop = new DemoWhileLoop();
        demoWhileLoop.whileDemo(10);
        demoWhileLoop.doWhileDemo(3);
    }
    }
