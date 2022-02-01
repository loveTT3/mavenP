package JDBC.utils;

// 利用反射 读取配置文件
public class JdbcUtils {
    static{
        try {
            JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
