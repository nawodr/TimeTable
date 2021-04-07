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
 * @author RPsandeepa
 */
public class GroupNum {
    
    Connection connection = DBConnection.getConnection();

    public int insert(String grp_num) throws SQLException {

        String query = "INSERT INTO GroupNum (grp_num) VALUES (?)";

        PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, grp_num);
        return ps.executeUpdate();
    }

    public boolean isCheckAS(String as) throws SQLException {

        boolean temp = true;
        
        PreparedStatement ps = connection.prepareStatement(" SELECT grp_num FROM GroupNum WHERE grp_num = ? ");
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
