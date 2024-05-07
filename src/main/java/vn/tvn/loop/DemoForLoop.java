package vn.tvn.loop;

public class DemoForLoop {
    //for(), trong ngoặc có 3 statment, mỗi statment ứng vs 1 giá trị
    //SM 1 là kiểm giá trị,
    // SM 2 kiểm tra đúng hay ko, đúng thì dừng lại

    public void demoForI(int a){
        for(int i = 0; i < 5; i++){
            System.out.println("So: " + i);
        }
    }

    //(giá trị đầu :giá tri cuối)
    //dạng Array nên dùng for each hơn for i
    public void demoForEach(String[] carNames){
        for (String car :carNames){
            System.out.println(car);
        }
    }

    public void demoFor(String[] carNames){
        for(int i = 0; i <carNames.length; i++){
            System.out.println(carNames[i]);
        }
    }

    public static void main(String[] args) {
        DemoForLoop demo = new DemoForLoop();
        demo.demoForI(1);
        String[] cars = {"Mazda","Toyota","BMW", "Volvo", "Ford"};
        demo.demoForEach(cars);
        demo.demoFor(cars);
        demo.getOldNumber(3);
    }

    //BT: Cho 1 số n lấy ra các số lẻ bé hơn số n đó
    // 10phut

    public void getOldNumber(int n){
        for (int i = 1; i <= n; i=i+2){
            System.out.println(i);
        }
    }

}
