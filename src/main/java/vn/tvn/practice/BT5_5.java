package vn.tvn.practice;

import vn.tvn.practice.bt_5.FileResourceUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BT5_5 {

/*Write a Java function to read student.properties file. (google keyword: `read file properties java` )
Ex: https://www.mkyong.com/java/java-properties-file-examples/
//1. The program read this file and save in Map data type.
b. After write function print all info of this Map
https://drive.google.com/file/d/1mevVLTBgExk_taWrZyu7aaBCWYSHtTGg/view */

    //Cần tạo 1 resource => Main > Directory > resource
    //Đọc file properties bằng cách truyền full đường dẫn
   public Properties readFileProperties(String path) {
        try {
            InputStream inputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Đọc file from resource => search gg Read file from resource
    //Tạo ra 1 file ResourceUtils để dùng đc cho những file khác
    public Properties readPropertiesResource(String nameFile){
        Properties properties = new Properties();
        try {
            var inputStream = FileResourceUtils.getFileResource(nameFile);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
    public Map<String, String> convertPropertiesToMap(Properties properties){
        var keys = properties.keySet();
        Map<String, String> map = new HashMap<>();
        for (Object key : keys){
            map.put(key.toString(), properties.getProperty((String) key));
        }
        return map;
    }

    public static void main(String[] args) {
        BT5_5 bt5_5 = new BT5_5();
        String path = "/Users/huyennguyen/Downloads/student.properties";
        var properties = bt5_5.readFileProperties(path);
        var pro = bt5_5.readPropertiesResource("student.properties");
        var map = bt5_5.convertPropertiesToMap(pro);
        System.out.println("Done");

    }
    // BT read file json, yaml, txt, excel
}