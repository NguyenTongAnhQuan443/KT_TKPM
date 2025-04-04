package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
    private static Singleton instance;
    private Connection connection;

    private Singleton() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PTUD_QuanLyBanQuanAo",
                    "root",
                    "sapassword");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("This is Singleton!");
    }
}