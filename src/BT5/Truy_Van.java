package BT5;

import BT1.Product_manager;

import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Truy_Van {
    public static void main(String[] args) throws SQLException {
        Product_manager productManager = new Product_manager();
        Connection connection = productManager.connect();
        String query = "SELECT * FROM product";

        Statement stm = null;
        try {

            stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                String detail = rs.getString("detail");
                String manufactuner = rs.getString("manufactuner");
                int number = rs.getInt("number");
                System.out.println(id + " - " + name + " - " + price + " - " + detail + " - " + detail + " - " + manufactuner);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
