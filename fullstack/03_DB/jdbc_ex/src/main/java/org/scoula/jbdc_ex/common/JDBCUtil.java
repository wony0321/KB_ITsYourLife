package org.scoula.jbdc_ex.common;

import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {
    // 1. 드라이버 설정, 2. db 연결 정보 이용해서 연결하는 것까지
    // --> Connection con; 객체의 주소를 리턴하게 됨

    static Connection conn = null;

    public static Connection getConnection() {
        if (conn != null) return conn;
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String id = properties.getProperty("id");
            String password = properties.getProperty("password");

            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
