package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final Connection conn = buildConnection();
    private static final String url = "jdbc:mysql://localhost:3306/pp_1_1_3_jdbc_hibernate";
    private static final String user = "root";
    private static final String password = "Iqprimer100@";

    private static Connection buildConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return conn;
    }

}
