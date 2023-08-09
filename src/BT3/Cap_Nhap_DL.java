package BT3;

import BT1.Product_manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Cap_Nhap_DL {
    public static void main(String[] args) throws  SQLException {
        Product_manager productManager = new Product_manager();
        Connection connection = productManager.connect();

        String query = "UPDATE product SET detail = 'dữ liệu mới' WHERE id = 4";
        String query1 = "UPDATE product SET manufactuner = 'apple',price = 12000000 WHERE id = 2 ";
        String query2 = "UPDATE product SET number = 20,status = 0 WHERE id = 6";
        Statement stm = null;
        stm = connection.createStatement();
        int row = stm.executeUpdate(query);
        int row1 = stm.executeUpdate(query1);
        int row2 = stm.executeUpdate(query2);
        if (row != 0) {
            System.out.println("Cap Nhap  thanh cong");
        }
        connection.close();
    }
}

