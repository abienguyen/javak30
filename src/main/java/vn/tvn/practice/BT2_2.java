package vn.tvn.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

import static vn.tvn.practice.BaiTapVN2.compareString;

public class BT2_2 {
    //Sửa BT

    //Câu 3: Write a java method to compare two String and return boolean
    //Ex data input
    //String a = "test java" vs String b = null
    //String c = null vs String d = "test java"
    //Research google về StringUtils, Objects, String  để viết 3 method khác nhau. --> cái nào nên dùng

    //Sửa BT
    public static boolean compareStringA(String st1, String st2){
        //dùng equals thì giá trị trước đó ko đc là Null
        var result = st1.equals(st2);
        return result;
    }

    public static boolean compareStringObject(String st1, String st2){
        //Objects có sẵn của java
        // Object.equals là xử lý luôn giá trị Null hoặc ko Null
        var result = Objects.equals(st1,st2);
        return result;
    }

    public static boolean compareStringStringUtils(String st1, String st2) {
        //StringUtils  cần import org.apache.commons.lang3.StringUtils trong pom.xm
        //StringUtils cũng là xử lý luôn giá trị Null hoặc ko Null
        var result = StringUtils.equals(st1, st2);
        return result;
    };

        public static void main (String[]args){
            String a = "Test java";
            String b = null;
            var rs1 = compareString(a, b);
            System.out.println("rs1: " + rs1);

            String c = null;
            String d = "Test java";
            var rs2 = compareStringStringUtils(c, d);
            System.out.println("rs2: " + rs2);
        }
    }


