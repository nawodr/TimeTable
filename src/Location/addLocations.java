/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import Location.Locations;
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
     check whether Laction Building & Room is exist
     */
    public String getBuildingName(int Id) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        String bName = null;
        
        try {
            ps = connection.prepareStatement("Select building_Name FROM location WHERE Id = ?");

            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bName = (rs.getString("building_Name"));
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
        System.out.println(bName);
        return bName;
    }
    /*
     Show Location List
     */
    public List<Locations> ShowLocationList() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<Locations> LocationList = new ArrayList();
        
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
                LocationList.add(locations);
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
        return LocationList;
    }
    
    /*
     Load Rooms
     */
    public List<String> LoadRooms() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> roomList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT room_Name FROM location ORDER BY Id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                roomList.add(rs.getString("room_Name"));
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
        return roomList;
    }
    
    /*
     Load Rooms
     */
    public List<String> LoadRooms(String type) throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> roomList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT room_Name FROM location where room_Type = ? ORDER BY Id");
            //excuite sql
            ps.setString(1, type);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                roomList.add(rs.getString("room_Name"));
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
        return roomList;
    }
    
    /*
     Load Tags
     */
    public List<String> LoadTagId() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> tagList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT tagId FROM Tag ORDER BY tagId");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                tagList.add(rs.getString("tagId"));
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
        return tagList;
    }
    
    /*
    Get Customer Specified by Customer Code
     */
//    public CustomerModel getCustomerById(String Customer_Code) throws SQLException {
//        
//        Connection connection = DB.getConnection();
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        
//        CustomerModel customer = new CustomerModel();
//        
//        try {
//            ps = connection.prepareStatement("SELECT Customer_Code,Phone_Num,Name,Address1,Address2,Address3,Tel,Email FROM customer WHERE Customer_Code = ?");
//
//            //excuite sql
//            ps.setString(1, Customer_Code);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                // get db value
//                customer.setPhoneNumber(rs.getString("Phone_Num"));
//                customer.setName(rs.getString("Name"));
//                customer.setAddress1(rs.getString("Address1"));
//                customer.setAddress2(rs.getString("Address2"));
//                customer.setAddress3(rs.getString("Address3"));
//                customer.setTel(rs.getString("Tel"));
//                customer.setEmail(rs.getString("Email"));
//                customer.setCode(rs.getString("Customer_Code"));
//            }
//        } catch (SQLException ex) {
//                throw ex;
//        }finally {
//            try {
//                if(ps != null){
//                    ps.close();
//                }
//            } catch (Exception ex) {
//                throw ex;
//            }  
//        }
//        return customer;
//    }
}
