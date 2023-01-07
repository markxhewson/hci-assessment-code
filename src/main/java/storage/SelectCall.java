package storage;

import java.sql.ResultSet;

public interface SelectCall {
    void call(ResultSet resultSet);
}
