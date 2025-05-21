package org.scoula.jdbc_ex.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {

    static Connection connection = null;

    // getConnection() 스태틱 메서드를 정의
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection != null) return connection;
        
        Properties prop = new Properties();
        
        try {
            // Properties 클래스를 이용하여 application.properties 파일 로드
            prop.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            // 데이터베이스 접속에 필요한 정보 추출
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String id = prop.getProperty("id");
            String password = prop.getProperty("password");
            
            Class.forName(driver);

            // jdbc_ex 데이터베이스에 접속하여 Connection 객체 보관
            connection = DriverManager.getConnection(url, id, password);

            System.out.println("연결 성공 객체: " + connection);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new SQLException(e);
        }

        return connection;
    }

    // 데이터베이스 접속을 끊는 close() 메서드 정의
    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                connection = null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
