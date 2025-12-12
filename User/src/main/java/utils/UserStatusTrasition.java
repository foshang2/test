package utils;

import entity.UserStatus;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@MappedJdbcTypes(JdbcType.INTEGER)  // 声明处理VARCHAR类型
@MappedTypes(UserStatus.class)
public class UserStatusTrasition extends BaseTypeHandler {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, ((UserStatus)o).getStatus());

    }

    @Override
    public Object getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return UserStatus.transition(resultSet.getInt(s));
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Object getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
