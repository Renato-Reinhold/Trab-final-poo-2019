import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.connection.ConnectionFactory;

public class teste {

    public static void main(String[] args) throws SQLException {

        // conectando
        Connection con = new ConnectionFactory().getConnection();

        // cria um preparedStatement
        String sql = "select * from autor";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        if (result.next()) {
            System.out.println("tem");
        } else {
            System.out.println("vazio");
        }

        stmt.execute();
        stmt.close();

        System.out.println("alo!");

        con.close()
    }
}