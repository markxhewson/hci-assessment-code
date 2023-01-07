package storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    public static Connection connection;
    protected String url;

    protected String username, password;

    public MySQL() {
        this.username = "username";
        this.password = "password";
        this.url = "url";

        this.connect();
    }

    public void connect() {
        try {
            this.setConnection(DriverManager.getConnection(this.url, this.username, this.password));
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isConnectionOpen() throws SQLException {
        return !this.connection.isClosed();
    }

    public Connection getConnection() {
        try {
            if (this.connection == null || this.connection.isClosed()) {
                this.setConnection(DriverManager.getConnection(this.url, this.username, this.password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return this.connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
