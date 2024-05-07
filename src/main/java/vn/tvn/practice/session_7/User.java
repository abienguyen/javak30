package vn.tvn.practice.session_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

//Này gọi là lombok, giúp cho code gọn hơn
@Getter
@Setter
@Data //đại diện cho Getter vs Setter, khi chưa khai báo getter và setter
@NoArgsConstructor // tương đương vs Constructor empty
@AllArgsConstructor //tương đương vs Constructor full

//Khi sử dụng ObjectMapper thì cần tạo 4 cái:
// JsonIgnoreProperties, constructor empty, contrucstor full và getter, setter các thuộc tính
//Hoặc khi dùng lombok mvn thì ko cần khai báo những giá trị này, mà có thể dùng những innotation
@JsonIgnoreProperties(ignoreUnknown = true)//ignore đi những value ko cần thiết
public class User {
    private Integer id;
    private String name;
    @JsonProperty("username")//cách lấy map đúng vs tên api và đúng syntax java
    private String userName;
    private String email;
    private Address address;

    @Getter
    @Setter
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)

    //class Address sẽ nằm trong class User
    public static class Address {
        private String street;
        private String city;
        private Geo geo;

        @Getter
        @Setter
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)// nên có, để đảm bảo sau này api thêm field sẽ ko bị ảnh hưởng
        public static class Geo{
            private String lat;
            private String lng;
        }
    }
}

//    public User(){} //Constructor empty
//
//    public User(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public User(Integer id, String name, String username, String email) {
//        this.id = id;
//        this.name = name;
//        this.username = username;
//        this.email = email;
//    }// constructor full
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

