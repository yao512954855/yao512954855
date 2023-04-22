package org.yao.utils;


import org.yao.model.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author yao
 * @jikeyou
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public class DBUtils {
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static Connection initDb(Db db) throws SQLException {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(db.getUrl(), db.getUsername(), db.getPassword());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

        return connection;
    }
}
