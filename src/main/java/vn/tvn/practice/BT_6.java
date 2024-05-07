package vn.tvn.practice;

import java.util.*;

public class BT_6 {
    //6.1Viết function để đảo ngược thứ tự vị trí các giá trị trong 1 ArrayList<String>
    //Ex: ["volvo", "BMW", "Toyota", Mzada"]
    //==> out put
    //["Mzada", "Toyota", "BMW","volvo"]
    
    public void reverseNumber(){
        ArrayList<String> number = new ArrayList<>();
        var cars = Arrays.asList("volvo", "BMW", "Toyota", "Mzada");
        Collections.reverse(cars);
        System.out.println("After Reverse Order, ArrayList Contains : " + cars);
    }

    public ArrayList<String> reverse(ArrayList<String> firstList){
        Collections.reverse(firstList);
        return firstList;
    }

    public ArrayList<String> reverse2(ArrayList<String> firstList){
        ArrayList<String> result = new ArrayList<>();
        int initial = firstList.size() -1;
        for (int i = initial; i >=0; i--){
            result.add(firstList.get(i));
        }
        return result;
    }

    //6.2: Viết method count xem 1 số xuất hiện bao nhiêu lần trong arrayList
    //Ex:  arrayList: = [1, 2,3,3, 2,4, 6,8,3,4,2,2,9]
    //==> output
    //Có 1 số 1
    //Có 4 số 2
    //Có 3 số 3
    //Có 2 số 4
    //.....

    public void countNumber(int[] a) {
        int countNumber = 0;
        for (int i : a)
        if (i == 1) {
            countNumber++;
        }
        System.out.println("Số lần xuất hiện là: " + countNumber);
    }

    public Map<Integer, Integer> countNumberInArray(ArrayList<Integer> numbers){
        if(Objects.isNull(numbers)){
            return new HashMap<Integer, Integer>();
        }
        Map<Integer, Integer> result = new HashMap<>();
        for(int number : numbers){
            if(result.containsKey(number)){
                result.put(number, result.get(number) + 1);
            } else{
                result.put(number, 1);
            }
        }
        return result;
    }

    public void countNumberInArray2(ArrayList<Integer> numbers){
        ArrayList<Integer> exist = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            int count = 1;
            if (exist.contains(numbers.get(i))){
                continue;//sẽ ko làm tiếp vòng lặp, sẽ nhảy qua vòng lặp tiếp theo
                //break;//là dừng luôn vòng for
            } else {
                exist.add(numbers.get(i));
            }
            for(int j = i + 1; j < numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)) {
                    count = count + 1;
                }
            }
            var mes = String.format("Co %d so %d",
                    count,numbers.get(i));
            System.out.println(mes);
        }
    }

    public static void main(String[] args) {
        BT_6 bt_6 = new BT_6();
        bt_6.reverseNumber();
        //ArrayList<Integer> array = new ArrayList<>(
        //        Arrays.asList(1, 2,3,3, 2,4, 6,8,3,4,2,2,9)
        //);
        ArrayList<Integer> array = null;

        var result = bt_6.countNumberInArray(array);
        //for (int key : result.keySet()){
        // var mes = String.format("Co %d so %d", result.get(key));
          //  System.out.println(mes);
       // }
        bt_6.countNumberInArray2(array);
        bt_6.getLocationNumber(array, 1);
        ArrayList<String> arrayList = new ArrayList<>();
                Arrays.asList("volvo", "BMW", "Toyota", "Mzada");
        //bt_6.reverse(arrayList);
        var a = bt_6.reverse2(arrayList);
        System.out.println("done");
    }

    //BT: list int và 1 số cho trước
    // ---> tìm vị trí đầu tiên của số đó

    public void getLocationNumber(List<Integer> numbers, int n){
        try {
            for(int i = 0; i< numbers.size(); i++){
            if(numbers.get(i) == n){
                System.out.println("Vị trí là: " + i);
                break;
            }
        }

        }catch (Exception e){

        }//Exception này sẽ bao quát hết tất cả expection còn lại
        //Nếu chưa biết dùng exception nào thì dùng Execption này, nó sẽ bao quát và bắt đc bất kỳ exception nào
        System.out.println("Not null value");
    }
    public void getLocationNumber2(List<Integer> numbers, int n){
        for(int i = 0; i< numbers.size(); i++){
            if(numbers.get(i) == n){
                System.out.println("Vị trí là: " + i);
                return;//dùng void thì return ko có giá trị
            }
        }
    }
    public int getLocationNumber3(List<Integer> numbers, int n){
        for(int i = 0; i< numbers.size(); i++){
            if(numbers.get(i) == n){
                System.out.println("Vị trí là: " + i);
                return i;//dùng int thì return có giá trị
            }
        }
        return -1; //-1 là ko có index
    }
}
