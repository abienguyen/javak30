package vn.tvn.practice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;


public class ConnectDB {
        private static String DB_URL = "jdbc:mysql://db4free.net:3306/java_tester";
        private static String USER_NAME = "java_tester_ad";
        private static String PASSWORD = "!6zxq*Rk##APvnG";

        /**
         * main
         *
         * @author viettuts.vn
         * @param args
         */
        public static void main(String args[]) {
            try {
                // connnect to database 'testdb'
                Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
                // crate statement
                Statement stmt = conn.createStatement();
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery("select * from customer");
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3));
                }
                // close connection
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
}
