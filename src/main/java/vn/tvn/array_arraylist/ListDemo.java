package vn.tvn.array_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    //List này là 1 interface của ArrayList

    public void initialize(){
        List<String> carsName = new ArrayList<>();
        carsName.add("Volvo");

        //Tạo nhanh set giá trị ko cần fai
        List<String> cars = new ArrayList<>(
                List.of("Volvo", "BMW", "Ford")
        );
    }
}
