package JDBC.com.prepared;

import java.sql.*;

public class TestSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bzbh?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(url,username,password);

        String sql= "select * from orders where order_num = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,20008);

        ResultSet rs = pst.executeQuery();
        if ( rs.next()){
            System.out.println("查询成功");
            System.out.println(rs.getObject("order_num"));
        }

        rs.close();
        pst.close();
        conn.close();
    }

}
