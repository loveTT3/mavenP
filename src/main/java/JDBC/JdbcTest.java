package JDBC;

import java.sql.*;
//我的第一个jdbc程序


public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");//固定写法 加载驱动
        //  2.用户信息和url
        String url = "jdbc:mysql://localhost:3306/bzbh?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "root";
        //   3.链接成功，数据库对象
        Connection conn = DriverManager.getConnection(url,username,password);
        //   4.执行sql的对象  statement
        Statement statement = conn.createStatement();
        // 5.执行sql的对象 去执行sql
        String sql= "select * from customers;";
        ResultSet resultSet = statement.executeQuery(sql); //返回结果集

        while (resultSet.next()){
            System.out.println("cust_name: "+resultSet.getObject("cust_name"));
        }

        // 6.释放连接
        resultSet.close();
        statement.close();
        conn.close();
    }
}
