package br.com.strn.ec.database.atualizador.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sequence {

    public static Long nextVal(Connection conn, String sequence) throws SQLException {

        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            String sql = "SELECT nextval('" + sequence + "')";

            try (ResultSet rs = stmt.executeQuery(sql)) {
                while(rs.next()) {
                    return rs.getLong(1);
                }
            }
        }

        return null;
    }
}
