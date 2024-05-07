package vn.tvn.practice.bt_7;

public class RunDemoUser {
    public static void main(String[] args) {
        String json ="{\"id\": 1,\n" +
                "        \"name\": \"Leanne Graham\",\n" +
                "        \"username\": \"Bret\",\n" +
                "        \"email\": \"Sincere@april.biz\",\n" +
                "        \"address\": {\n" +
                "            \"street\": \"Kulas Light\",}";
        JsonUtils jsonUtils = new JsonUtils();
        var user = jsonUtils.convertJsontoUser(json);
        System.out.println("Done");
    }
}
