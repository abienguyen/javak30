package vn.tvn.practice.bt_7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    public User convertJsontoUser(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.readValue(json, User.class);
        } catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return null;
    }
}
