package JDBC.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

// 利用反射 读取配置文件
public class JdbcUtils{

    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;

    public static void main(String[] args) {

    }

    static{
        try {
            InputStream inn = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
//            FileInputStream in = new FileInputStream(JdbcUtils.class.getResource("/").getPath()+"db.properties");
            System.out.println(inn);
            Properties properties = new Properties();
            properties.load(inn);

            driver = properties.getProperty(driver);
            url = properties.getProperty(url);
            username = properties.getProperty(username);
            password = properties.getProperty(password);

            // 1.驱动只用加载一次
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取链接
    public static Connection getConnection() throws SQLException {
        return  DriverManager.getConnection(url,username,password);
    }

//    释放连接资源
    public static void release(Connection conn, Statement st, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if (st != null){
            try {
                st.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
