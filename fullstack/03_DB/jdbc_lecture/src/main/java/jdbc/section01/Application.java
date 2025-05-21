package jdbc.section01;

import jdbc.common.JDBCUtil;
import java.sql.Connection;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = JDBCUtil.getConnection();
    }
}
