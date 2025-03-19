package Day0318.src.main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class DatabaseConnection {
    private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASSWORD = "1234";

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("X 데이터베이스 연결 실패");
        }
    }
    public static void main(String[] args){
        Connection conn = getConnection();
        if(conn != null){
            System.out.println("Oracle 데이터베이스 연결 성공");
        }
    }
}

