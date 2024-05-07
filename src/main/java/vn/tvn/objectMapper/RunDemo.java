package vn.tvn.objectMapper;

public class RunDemo {

    public static void main(String[] args) {
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        JsonUtils jsonUtils = new JsonUtils();
        var car = jsonUtils.convertJsonToCar(json);
        System.out.println("Done");
    }
}
