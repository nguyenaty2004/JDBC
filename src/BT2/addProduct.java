package BT2;

import BT1.Product_manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class addProduct {
    public static void main(String[] args) throws SQLException {
        Product_manager addProduct = new Product_manager();
        Connection connection = addProduct.connect();

        String query = "INSERT INTO product (id,name,price,detail,manufactuner,number,status)"+ "Values(6,'reomi',400,'dien thoai : Hang deu','nha cai Reomi',8800,true)";
        Statement stm = null;
        stm = connection.createStatement();
        int row = stm.executeUpdate(query);
        if(row != 0 ){
            System.out.println("them thanh cong");
        }
        connection.close();
    }


}
