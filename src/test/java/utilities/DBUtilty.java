package utilities;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class DBUtilty {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection() throws SQLException {

        switch (Config.getProperty("dbType")){

            case "oracle":
                connection = DriverManager.getConnection(Config.getProperty("oracleURL"),
                        Config.getProperty("oracleUsername"),
                        Config.getProperty("oraclePassword"));
                break;
            case "mysql":
                // create connection for mysql
                break;
            default:
                connection = null;

        }
    }

    public static List<Map<Object, Object>> executeQuery (String query) throws SQLException {
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


        return null;
    }

    public static void close() throws SQLException {
        connection.close();
        statement.close();
        resultSet.close();
    }
}


