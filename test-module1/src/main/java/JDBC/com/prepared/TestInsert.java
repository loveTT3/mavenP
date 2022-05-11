package JDBC.com.prepared;

import java.sql.*;
import java.util.Date;


public class TestInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bzbh?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(url,username,password);

//        String sql= "INSERT INTO orders (order_num,order_date,cust_id) VALUES (20010,\"2005-10-08 00:00:00\",10001);";
        // 与statement 区别：手动插入占位符
        String sql= "INSERT INTO orders (order_num,order_date,cust_id) VALUES (?,?,?);";


        PreparedStatement pst = conn.prepareStatement(sql); // 预编译sql
        // 手动给参数赋值
        pst.setInt(1, 20011);
        // sql.date 数据库 java.sql.date()
        // util.date java new Date().getTime() 获得时间戳
        pst.setDate(2,new java.sql.Date(new Date().getTime()));
        pst.setInt(3,10001);

        int i = pst.executeUpdate();
        if (i > 0){
            System.out.println("插入成功");
        }

        pst.close();
        conn.close();
    }
}
