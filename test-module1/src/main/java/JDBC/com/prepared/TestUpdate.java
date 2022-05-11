package JDBC.com.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
    public static void main(String[] args) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/bzbh?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "root";
        conn = DriverManager.getConnection(url,username,password);

        String sql = "update orders set cust_id = ? where order_num = ?";
        pst = conn.prepareStatement(sql);
        pst.setInt(1,10001);
        pst.setInt(2,20008);

        int i = pst.executeUpdate();
        if (i > 0){
            System.out.println("更新成功");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            pst.close();
            conn.close();
        }
    }
}
