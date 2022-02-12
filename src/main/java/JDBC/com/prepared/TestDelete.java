package JDBC.com.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDelete {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bzbh?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(url,username,password);

        String sql = "delete from orders where order_num = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,20011);

        int i = pst.executeUpdate();
        if (i > 0){
            System.out.println("删除成功");
        }

        pst.close();
        conn.close();
    }
}
