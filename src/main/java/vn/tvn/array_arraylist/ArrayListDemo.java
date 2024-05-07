package vn.tvn.array_arraylist;

import vn.tvn.class_object.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public void initialize() {
        ArrayList<String> carNames = new ArrayList<>();
        ArrayList<Integer> carIds = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        //auto incr size khi mà add new item

        //add new - theo thứ cái nào add trước sẽ vô index trước
        carNames.add("Volvo");
        carNames.add("BMW");

        //set (update)
        carNames.set(0, "Toyota");

        //remove
        carNames.remove("Toyota");

        //Tạo nhanh set giá trị ko cần fai khai bao
        ArrayList<String> cars = new ArrayList<>();
        Arrays.asList("Volvo", "BMW", "Ford");

        // lấy data trong array
        String name = cars.get(1); //=> BMW

        var sublist = cars.subList(1, 2); // ==> "BMW", "Ford" - lấy giá trị 1 và 2

        //Tạo ra object mới
        cars.clone();
    }

    public void demoObjectAtributes() {
        int a = 10;
        int b = a;
        a = a + 10;
        System.out.println(a);
        System.out.println(b);

        ArrayList<String> cars = new ArrayList<>();
        Arrays.asList("Volvo", "BMW", "Ford");

        ArrayList<String> cars2 = cars; // cái này sẽ ko độc lập, nó vẫn liên quan nhau
        ArrayList<String> cars3 = (ArrayList<String>) cars.clone(); // sẽ tạo ra object mới, sẽ độc lập và ko lq nhau
        cars.add("Toyota");

        System.out.println(cars);
        System.out.println(cars2);
    }

    public static void main(String[] args) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        arrayListDemo.initialize();
        arrayListDemo.demoObjectAtributes();
        ArrayList<Integer> arrayList = new ArrayList<>(
                Arrays.asList(1,5,6,2,7)
        );

        var old = arrayListDemo.getOldArrayList(arrayList);
        System.out.println(old);
        var sum = arrayListDemo.getSumArray(arrayList);
        System.out.println(sum);
    }

    //BT có ArrayList kiểu integer (chẳn, lẻ)
    // --> Viết method trả về ArrayList toàn số lẻ

    public ArrayList<Integer> getOldArrayList(ArrayList<Integer> array){
        ArrayList<Integer> oldArrayList = new ArrayList<>();
        for(int a : array){
            if(a %2 != 0){
                oldArrayList.add(a);
            }
        }
    return oldArrayList;

    }
    //BT: có 1 arrylist int => tính tổng array đó

    public int getSumArray(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int number : arrayList){
            sum = sum + number;
        }
        return sum;
    }
}
