package vn.tvn.extending;

import java.time.LocalDate;

public class CollegeStudent extends Student {
    private String collegeId;

    public CollegeStudent(String name, String address,
                          LocalDate birthday, String phone, String clazz, String collegeID) {
        super(name, address, birthday, phone, clazz);
        this.collegeId = collegeId;
    }
}
