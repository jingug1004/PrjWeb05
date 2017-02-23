package org.zerock.web;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

    private static final String DRIVER =
            "com.mysql.jdbc.Driver";
    private static final String URL =
            "jdbc:mysql://127.0.0.1:3306/book_ex";
    private static final String USER =
            "root";
    private static final String PW =
            "1111";


    @Test
    public void testConnection() throws Exception {

        Class.forName(DRIVER);

        // 밑 별도의 클로즈를 안 해줘도 됨.
        try (Connection con = DriverManager.getConnection(URL, USER, PW)) {

            System.out.println(con);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
