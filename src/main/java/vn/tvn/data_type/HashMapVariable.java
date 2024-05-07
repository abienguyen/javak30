package vn.tvn.data_type;

import vn.tvn.practice.bt_4.ClazzBT;
import vn.tvn.practice.bt_4.ScoresBT;
import vn.tvn.practice.bt_4.StudentBT;

import java.util.HashMap;
import java.util.Map;

public class HashMapVariable {

    public void initialize(){
        //Syntax Map<key, value> => key là cái duy nhất, nếu bị trùng thì giá trị sau đè lên giá trị trc

        Map<String, String> cityMap = new HashMap<>();
        Map<Integer, String> demoMap = new HashMap<>();
        Map<String, StudentBT> studentMap = new HashMap<>();
        ClazzBT java = new ClazzBT("Java4Test",
                "123 Conh hoa", "IT");
        ScoresBT thinhScore = new ScoresBT((byte)12, (byte)13, (byte)14);

        StudentBT thinh = new StudentBT("001", "Thinh Tran",
                java, thinhScore, "13/01/1984");
        StudentBT thanh = new StudentBT("002", "Thanh Nguyen",
                java, thinhScore, "13/01/1984");


        // dua data vao map
        studentMap.put(thinh.getId(), thinh);
        studentMap.put(thanh.getId(), thanh);

        cityMap.put("VN", "Viet Nam");
        cityMap.put("EN", "England");
        cityMap.put("JP", "Japan");
        cityMap.put("CN", "China");
        cityMap.put("VN", "VietNam");

        // get data value
        var name = cityMap.get("VN");
        System.out.println(name);

        // ko biet key thi sao ma lay
        // --> lay tap hop key
        //Hàm for là mục đích lấy ra từng key trong list (hàm Map)
        var keys = cityMap.keySet();
        for (String key : keys){
            System.out.println(key);
            var value = cityMap.get(key);
            System.out.println(value);
        }

        // --> so luong item
        cityMap.size();

        //lay tap hop values
        var values = cityMap.values();
        for (String value : values){
            System.out.println(value);
        }

        var valueStudents = studentMap.values();
        for (StudentBT student : valueStudents){
            student.print();
        }

        // methods khac vef tim hieu
    }

    public static void main(String[] args) {
        HashMapVariable hashMapVariable = new HashMapVariable();
        hashMapVariable.initialize();
    }

}



