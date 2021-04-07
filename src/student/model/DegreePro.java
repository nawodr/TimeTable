/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.model;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DegreePro {

    Connection connection = DBConnection.getConnection();

    public int insert(String deg_pro) throws SQLException {

        String query = "INSERT INTO DegreePro (degName) VALUES (?)";

        PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, deg_pro);
        return ps.executeUpdate();
    }

    public boolean isCheckAS(String as) throws SQLException {

        boolean temp = true;
        
        PreparedStatement ps = connection.prepareStatement(" SELECT degName FROM DegreePro WHERE degName = ? ");
        ps.setString(1, as);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            if (rs != null) {
                temp = false;
            }
        }

        return temp;
    }

}
