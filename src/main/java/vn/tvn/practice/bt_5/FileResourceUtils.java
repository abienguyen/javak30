package vn.tvn.practice.bt_5;

import java.io.InputStream;
import java.util.Objects;

//Hàm này có thể dùng nhiều file khác, ko chỉ riêng file properties
public class FileResourceUtils {
    public static InputStream getFileResource(String nameFile){
        ClassLoader classLoader = FileResourceUtils.class.getClassLoader();
        var inputStream = classLoader
                .getResourceAsStream(nameFile);
        if (Objects.isNull(inputStream)){
            throw new IllegalArgumentException("file not found: "+ nameFile);
        }
        return inputStream;
    }

}
