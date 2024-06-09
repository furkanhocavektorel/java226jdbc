package org.vektorel.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    static Connection connection=null;


    public static Connection openConnection() {
        String url="jdbc:postgresql://localhost:5432/java226";
        String username="postgres";
        String password="root";
        String driver="org.postgresql.Driver";

        try {
            Class.forName(driver);

            connection = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.printf("sql açilrken hatasi aldık");
            e.printStackTrace();
        }

        return connection;

    }

    public static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("sql kapanırken hata");
            e.printStackTrace();
        }
    }


}
