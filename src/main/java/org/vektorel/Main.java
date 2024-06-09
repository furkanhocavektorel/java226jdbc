package org.vektorel;


import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner src= new Scanner(System.in);

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection
                ("jdbc:postgresql://localhost:5432/java226","postgres","root");

        String sql="select * from products";

        PreparedStatement p= connection.prepareStatement(sql);
        ResultSet resultSet= p.executeQuery();

        while (resultSet.next()){
            String pname=resultSet.getString("product_name");
            Double price= resultSet.getDouble("unit_price");
            System.out.println(pname);
            System.out.println(price);
        }


        String sqlInsert="insert into admins(id,ad,soyad) " +
                "values(10,(?),(?))";

        System.out.println("ad gir");
        String ad= src.nextLine();

        System.out.println("soyad gir");
        String sadsa= src.nextLine();

        p=connection.prepareStatement(sqlInsert);

        p.setString(1,ad);
        p.setString(2,sadsa);

        int ne_bu=p.executeUpdate();
        connection.close();
        System.out.println(ne_bu);





    }
}
