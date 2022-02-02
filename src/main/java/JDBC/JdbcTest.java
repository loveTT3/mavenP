package JDBC;

import com.sun.rowset.internal.Row;

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

//        conn.rollback();
//        conn.commit();
//        conn.setAutoCommit(true);


        //  4.执行sql的对象  statement
        Statement statement = conn.createStatement();

        // 5.执行sql的对象 去执行sql
        String sql= "select * from customers;";
        ResultSet resultSet = statement.executeQuery(sql); //返回结果集

//        statement.execute(sql);//可以执行任何sql
//        statement.executeQuery(sql); // 执行操作返回 resultset
//        statement.executeUpdate(sql);//更新插入删除 都是用这个，返回一个受影响的行数

        while (resultSet.next()){
            System.out.println("cust_name: "+resultSet.getObject("cust_name"));
        }

//        resultSet.beforeFirst();//移动到最前面
//        resultSet.afterLast();//移动到最后面
//        resultSet.next();//移动到下一个数据
//        resultSet.previous();//移动到前一行
//        resultSet.absolute();//移动到指定行

        // 6.释放连接
        resultSet.close();
        statement.close();
        conn.close();
    }
}
