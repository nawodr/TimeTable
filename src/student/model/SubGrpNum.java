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
public class SubGrpNum {
    
    Connection connection = DBConnection.getConnection();

    public int insert(String sub_grp_num) throws SQLException {

        String query = "INSERT INTO SubGrpNum (subGrpNum) VALUES (?)";

        PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, sub_grp_num);
        return ps.executeUpdate();
    }

    public boolean isCheckAS(String as) throws SQLException {

        boolean temp = true;
        
        PreparedStatement ps = connection.prepareStatement(" SELECT subGrpNum FROM SubGrpNum WHERE subGrpNum = ? ");
        ps.setString(1, as);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            if (rs != null) {
                temp = false;
            }
        }

        return temp;
    }
    
    public int update(int final_id, String sub_grp_num) throws SQLException{
        
        String query = "UPDATE SubGrpNum SET subGrpNum=? WHERE idSubGrpNum=?";
        
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, sub_grp_num);
        ps.setInt(2, final_id);
        int x = ps.executeUpdate();      
        return x;
        
    }
    
    public int delete(int final_id) throws SQLException{
        
        String query = "DELETE FROM SubGrpNum WHERE idSubGrpNum=?";
        
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, final_id);
        int x = ps.executeUpdate();       
        return x;
        
    }
    
}
