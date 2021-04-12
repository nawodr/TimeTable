/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nawod
 */
public class addLocations {
    /*
    Add Locations
     */
    public int addLocations(Locations location) throws SQLException {
        
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
        
        int locationId = 0;
        
        try {
            ps = connection.prepareStatement("INSERT INTO location (building_Name,room_Name,room_Type,capacity) VALUES (?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            
            // set db value
            ps.setString(1, location.getBuilding_Name());
            ps.setString(2, location.getRoom_Name());
            ps.setString(3, location.getRoom_Type());
            ps.setInt(4, location.getCapacity());
            
            
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            locationId = rs.getInt(1);

        } catch (Exception ex) {
            throw ex;
        }
        finally {
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (Exception ex) {
                throw ex;
            }
        }
        return locationId;
    }
    
    /*
    Update Customer Details Specified by Customer Code
     */
    public int UpdateLocations(Locations location) throws SQLException {
        
        int updateAns = 0;
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("UPDATE location SET building_Name = ?, room_Name = ?, room_Type = ?, capacity = ? WHERE Id = ?");
            // set db value
            ps.setString(1, location.getBuilding_Name());
            ps.setString(2, location.getRoom_Name());
            ps.setString(3, location.getRoom_Type());
            ps.setInt(4, location.getCapacity());
            ps.setInt(5, location.getId());
            
            updateAns = ps.executeUpdate();
            
        } catch (SQLException ex) {
            throw ex;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception ex) {
                throw ex;
            }
        }
        System.out.println(updateAns);
        return updateAns;
    }
    
     /*
    Delete customer Specified by Customer Code
     */
    public int DeleteLocation(int Id) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        int custermerDel = 0;
        
        try {
            ps = connection.prepareStatement("DELETE FROM location WHERE Id = ?");
            ps.setInt(1, Id);
            custermerDel =  ps.executeUpdate();
        
        } catch (SQLException ex) {
            throw ex;
        } finally {
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (Exception ex) {
                throw ex;
            }
        }
        
        return custermerDel;
    }
    
    /*
     check whether customer is exist by id
     */
    public boolean isExist(int Id) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        boolean isAvailable = false;
        
        try {
            ps = connection.prepareStatement("Select Id FROM location WHERE Id = ?");

            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("Id").isEmpty()) {
                    isAvailable = true;
                }
            }
        } catch (SQLException ex) {
            throw ex;
        }finally {
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (Exception ex) {
                throw ex;
            }
            
        }
        return isAvailable;
    }

    
    /*
     check whether Laction Building & Room is exist
     */
    public boolean isExistLocation(String bName, String rName) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        boolean isAvailable = false;
        
        try {
            ps = connection.prepareStatement("Select building_Name,room_Name FROM location WHERE building_Name = ? AND room_Name = ?");

            ps.setString(1, bName);
            ps.setString(2, rName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (!(rs.getString("building_Name").isEmpty() && rs.getString("room_Name").isEmpty())) {
                    isAvailable = true;
                }
            }
        } catch (SQLException ex) {
            throw ex;
        }finally {
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (Exception ex) {
                throw ex;
            }
            
        }
        return isAvailable;
    }
    
    /*
     Show Location List
     */
    public List<Locations> ShowLocationList() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<Locations> CustomerList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT Id,building_Name,room_Name,room_Type,capacity FROM location ORDER BY Id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                Locations locations = new Locations();

                locations.setId(rs.getInt("Id"));
                locations.setBuilding_Name(rs.getString("building_Name"));
                locations.setRoom_Name(rs.getString("room_Name"));
                locations.setRoom_Type(rs.getString("room_Type"));
                locations.setCapacity(rs.getInt("capacity"));
                

                //add object to arraylist
                CustomerList.add(locations);
            }
        } catch (SQLException ex) {
            throw ex;
        }finally {
                try {
                    if(ps != null){
                        ps.close();
                    }
                } catch (Exception ex) {
                    throw ex;
                }
        }
        return CustomerList;
    }

}
