import java.sql.*;

void transferMoney(Connection con, int fromId, int toId, double amount) throws SQLException {
    try {
        con.setAutoCommit(false);
        
        // Debit
        try (PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?")) {
            ps.setDouble(1, amount);
            ps.setInt(2, fromId);
            ps.executeUpdate();
        }

        // Credit
        try (PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
            ps.setDouble(1, amount);
            ps.setInt(2, toId);
            ps.executeUpdate();
        }

        con.commit();
    } catch (SQLException e) {
        con.rollback();
        throw e;
    }
}
