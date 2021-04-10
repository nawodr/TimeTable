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
public class TagModel {
    
    Connection connection = DBConnection.getConnection();
    
    public int insert(String tag_name, String tag_code, String tag) throws SQLException{
        
        String query = "INSERT INTO Tag (tagName, tagCode, relatedTag) VALUES (?, ?, ?)";
        
        PreparedStatement ps = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setString(1, tag_name);
        ps.setString(2, tag_code);
        ps.setString(3, tag);
        return ps.executeUpdate();
    }
    
    public boolean isCheckAS(String tag_name, String tag_code, String tag) throws SQLException {

        boolean temp = true;
        
        PreparedStatement ps = connection.prepareStatement(" SELECT tagName, tagCode, relatedTag FROM Tag WHERE tagId = ? ");
        ps.setString(1, tag_name);
        ps.setString(2, tag_code);
        ps.setString(3, tag);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            if (rs != null) {
                temp = false;
            }
        }

        return temp;
    }
    
    public int update(int final_id, String tag_name, String tag_code, String tag) throws SQLException{
        
        String query = "UPDATE Tag SET tagName=?, tagCode=?, relatedTag=? WHERE tagId=?";
        
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, tag_name);
        ps.setString(2, tag_code);
        ps.setString(3, tag);
        ps.setInt(4, final_id);
        int x = ps.executeUpdate();      
        return x;
        
    }
    
    public int delete(int final_id) throws SQLException{
        
        String query = "DELETE FROM Tag WHERE tagId=?";
        
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, final_id);
        int x = ps.executeUpdate();       
        return x;
        
    }
    
}
