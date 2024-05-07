package vn.tvn.practice.session_7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class BT_07 extends APIUtils{
    /*There is API: https://jsonplaceholder.typicode.com/users
a. Write a Java function read the info of the API above. (Some fileds: id, name, username, email, address.street)
+ google keyword search: How to send HTTP request GET/POST in Java
Ex: https://mkyong.com/java/how-to-send-http-request-getpost-in-java/
Using: https://jsonpath.com/ to get data
b. Using data from function above to write into excel file with format
||id|| username|| name || email || address.street||
| 1 | Bret | Leanne Graham| Sincere@april.biz | Kulas Light |


Note: https://www.baeldung.com/jackson-object-mapper-tutorial
xem them mapping json to object*/

    public String getUsers(){
        String url = "https://jsonplaceholder.typicode.com/users";
        String result = get(url);
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        BT_07 bt_07 = new BT_07();
        var usersString = bt_07.getUsers();
        var users = convertString2Object(usersString);

        System.out.println("Done");
    }

    public static List<User> convertString2Object(String string){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            var users = objectMapper.readValue(string, new TypeReference<List<User>>() {
            });//TypeReference sẽ convert sang dạng mà mình muốn
            return users;
        } catch (JsonProcessingException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void convert2ObjectViaJsonPath(String usersString){
        var context = JsonPath.parse(usersString);// JsonPath là 1 library giúp truy suất giá trị trong json
        List<LinkedHashMap<String, Object>> listUser = context.read("$[*]");//$[*] là lấy hết giá trị
        //$[0].address.geo.lat (là lấy giá trị lat) dựa theo link https://jsonpath.com/ to get data
        List<User> result = new ArrayList<>();
        for (LinkedHashMap<String, Object> user : listUser){
            Integer id = (Integer) user.get("id");
            String name = (String) user.get("name");
            //result.add(new User(id, name,"",""));
        }
    }
}
