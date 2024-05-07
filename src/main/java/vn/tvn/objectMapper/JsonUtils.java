package vn.tvn.objectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    public Car convertJsonToCar(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, Car.class);
        } catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }
}
