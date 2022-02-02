package JDBC;

import JDBC.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestInsert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection(); // 获取数据库链接
            st = conn.createStatement();
            String sql = "select * from customers;";
            rs = st.executeQuery(sql);

            System.out.println(rs);
        }catch (Exception e){

        }finally {
            JdbcUtils.release(conn,st,rs);
        }


    }
}
