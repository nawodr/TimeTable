package Location;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class NotAvailableLocationController {

    Connection con = DBConnection.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public String createId() {
    
        String id = "2000";
        
        try {

            String sql = "SELECT id FROM notAvailableLocation ORDER BY id DESC LIMIT 1";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            do {

                if((rs.next()) == true) {
                    
                    int newId = Integer.valueOf(rs.getString("id"));
                  
                    id = String.valueOf(newId + 1);
                    
                } 
                
                else if((rs.next()) == false) {

                    id = "2000";

                }
            } 
            
            while(rs.next());

        } 
        
        catch(Exception e) {

            System.out.println("Id not load correctly... " + e);

        }
        
        return id;
        
    }
    
    public void loadRoomCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT Id, building_Name, room_Name FROM location";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Room");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("Id") + "-" + rs.getString("building_Name") + "-" + rs.getString("room_Name"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Room not load correctly... " + e);

        }
    }
    
    public void loadHoursCombo(JComboBox jComboBox) {

        try {

            jComboBox.removeAllItems();
            
            int startIndex = 0;
                       
            for(int i = startIndex; i < 24; i++) {

                jComboBox.addItem(String.valueOf(i));
                
            } 
        } 
        
        catch(Exception e) {

            System.out.println("Hours not load correctly... " + e);

        }
    }
        
    public void loadMinutesCombo(JComboBox jComboBox) {

        try {

            jComboBox.removeAllItems();
            
            for(int i = 0; i < 61; i++) {

                if(i < 10) {
                
                    jComboBox.addItem(String.valueOf("0" + i));
                
                }
                
                else {
                
                    jComboBox.addItem(String.valueOf(i));
                
                }
            }
        } 
        
        catch(Exception e) {

            System.out.println("Minutes not load correctly... " + e);

        }
    }
    
    public void loadNotAvailableTable(JTable jTable) {

        try {
            
            int count = 0;
            
            String sql1 = "SELECT COUNT(id) AS count FROM notAvailableLocation";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            String dataArray[][] = new String[count][5];
            
            String sql2 = "SELECT id, room, date, start, end FROM notAvailableLocation";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                dataArray[i][0] = rs.getString("id");
                dataArray[i][1] = rs.getString("room");
                dataArray[i][5] = rs.getString("date");
                dataArray[i][6] = rs.getString("start");
                dataArray[i][7] = rs.getString("end"); 
                
                i++;
                
            }
            
            String col[] = {"ID", "Room", "Date", "Start Time", "End Time"};

            DefaultTableModel model = new DefaultTableModel(dataArray, col) {

                public boolean isCellEditable(int x, int y) {

                    return false;

                }
            };

            jTable.setModel(model);

            TableColumn no = jTable.getColumnModel().getColumn(0);
            no.setMaxWidth(50);
            no.setMinWidth(50);
            
            jTable.getColumnModel().getColumn(1);
            jTable.getColumnModel().getColumn(2);
            jTable.getColumnModel().getColumn(3);
            jTable.getColumnModel().getColumn(4);
                        
        } 
        
        catch(Exception e) {
            
            System.out.println("Not Available Location Information not load correctly... " + e);
            
        }        
    }
    
    public boolean insertNotAvailableLocation(NotAvailableLocationModel model) {
    
        boolean success;
        
        try {
            
            String sql = "INSERT INTO notAvailableLocation(id, room, date, start, end) VALUES('" + createId() + "', " + model.getRoom() + "', '" + model.getDate() + "', '" + model.getStartTime() + "', '" + model.getEndTime() + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            success = true;
                        
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't save record details proparly... " + e);
            
        }
                        
        return success;
        
    }

    public boolean deleteNotAvailableLocation(String id) {
    
        boolean success;
        
        try {
            
            String sql = "DELETE FROM notAvailableLocation WHERE id = '" + id + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            success = true;
                        
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't delete this record proparly... " + e);
            
        }
                        
        return success;
        
    }
}