package storage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL {

    public static void createTable(String name, String info) {
        try {
            MySQL.connection.prepareStatement("CREATE TABLE IF NOT EXISTS " + name + "(" + info + ");").execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void execute(String query, Object... values) {
        try {
            PreparedStatement statement = MySQL.connection.prepareStatement(query);

            for (int i = 0; i < values.length; i++) {
                statement.setObject(i + 1, values[i]);
            }

            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet select(String query) {
        try {
            MySQL.connection.prepareStatement(query).executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
