package BT4;

import BT1.Product_manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) throws SQLException {
        Product_manager productManager = new Product_manager();
        Connection connection= productManager.connect();

        String query = "DELETE FROM product WHERE id = 6";

        Statement stm = null;
        stm = connection.createStatement();
        int row = stm.executeUpdate(query);
        if(row != 0 ){
            System.out.println("Xoa thanh cong");
        }
        connection.close();
    }
}
