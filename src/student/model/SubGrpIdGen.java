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
public class SubGrpIdGen {
    
    Connection connection = DBConnection.getConnection();

    public int insert(String deg_pro) throws SQLException {       

        String query = "INSERT INTO SubGrpGenerate (SubGrpGenName) VALUES (?)";

        PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, deg_pro);
        return ps.executeUpdate();
    }

    public boolean isCheckAS(String groupId) throws SQLException {

        boolean temp = true;

        PreparedStatement ps = connection.prepareStatement(" SELECT SubGrpGenName FROM SubGrpGenerate WHERE SubGrpGenName = ? ");
        ps.setString(1, groupId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            if (rs != null) {
                temp = false;
            }
        }

        return temp;
    }

    public int update(int final_id, String groupId) throws SQLException{
        
        String query = "UPDATE SubGrpGenerate SET SubGrpGenName=? WHERE idSubGrpGen=?";
        
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, groupId);
        ps.setInt(2, final_id);
        int x = ps.executeUpdate();      
        return x;
        
    }
       
       public int delete(int final_id) throws SQLException{
        
        String query = "DELETE FROM SubGrpGenerate WHERE idSubGrpGen=?";
        
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, final_id);
        int x = ps.executeUpdate();       
        return x;
        
    }
    
}
