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
     Load Session id
     */
    public List<String> LoadSessionId() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> sessionIdList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT id FROM session ORDER BY id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                sessionIdList.add(rs.getString("id"));
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
        return sessionIdList;
    }
    
    /*
     Load Rooms Acording to student count
     */
    public List<String> LoadRoomsByCapacity(int stdCount, String type) throws SQLException {
    
        System.out.println(stdCount);
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> roomList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT room_Name FROM location where capacity >= ? AND room_Type = ? ORDER BY Id");
            //excuite sql
            ps.setInt(1, stdCount);
            ps.setString(2, type);
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
    
    public int getstdCountById(int id) throws Exception{
         Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null; 
        int stdCount = 0;
        try {
            ps = connection.prepareStatement("SELECT stu_count FROM session where id = ?");
            //excuite sql
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                stdCount = Integer.parseInt(rs.getString("stu_count"));
            }

        } catch    // create objct & set db value
             (SQLException ex) {
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
        return stdCount;
    }
    
    /*
     Load Session id
     */
    public List<String> LoadGroupId() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> groupIdList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT gId,sGid FROM all_details ORDER BY id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                groupIdList.add(rs.getString("gId"));
                groupIdList.add(rs.getString("sGid"));
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
        return groupIdList;
    }
    
    /*
     Load All Lecturer id
     */
    public List<String> LoadLecturerId() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> groupIdList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT id FROM Lecture ORDER BY id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                groupIdList.add(rs.getString("id"));
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
        return groupIdList;
    }

    /*
     check whether any location is exist by passing  query,id & Column name
     */
    public boolean isExist(String Id, String query, String colName) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        boolean isAvailable = false;
        int col = 0;
        
        try {
            ps = connection.prepareStatement(query);

            ps.setString(1, Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (!rs.getString(colName).isEmpty()) {
                isAvailable = true;
            }
//                
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
     Load Tags
     */
    public List<String> LoadBuiling() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<String> BuilingList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT name FROM building_Details ORDER BY id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                BuilingList.add(rs.getString("name"));
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
        return BuilingList;
    }
    //getting total row count by passing query and colName
    public String getRowCount(String query, String colName) throws Exception{
        String totLec = null;
        try {
            PreparedStatement ps = null;
            Connection connection = DBConnection.getConnection();

            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                totLec = rs.getString(colName);
            }
        } catch (Exception e) {
            throw(e); 
        }     
        return totLec;
    }
    
    public String getLabCount(String query, String colName) throws Exception{
        String totLec = null;
        try {
            PreparedStatement ps = null;
            Connection connection = DBConnection.getConnection();

            ps = connection.prepareStatement("SELECT COUNT(Id) as count FROM location WHERE room_Type = 'Labarotaory'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                totLec = rs.getString(colName);
            }
        } catch (Exception e) {
            throw(e); 
        }     
        return totLec;
    }
}
