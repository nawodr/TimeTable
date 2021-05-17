package Session;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class NotAvailableTimeController {

    Connection con = DBConnection.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public String createId() {
    
        String id = "1000";
        
        try {

            String sql = "SELECT id FROM notAvailableTime ORDER BY id DESC LIMIT 1";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            do {

                if((rs.next()) == true) {
                    
                    int newId = Integer.valueOf(rs.getString("id"));
                  
                    id = String.valueOf(newId + 1);
                    
                } 
                
                else if((rs.next()) == false) {

                    id = "1000";

                }
            } 
            
            while(rs.next());

        } 
        
        catch(Exception e) {

            System.out.println("Id not load correctly... " + e);

        }
        
        return id;
        
    }
    
    public void loadLecturerCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT empid, empname FROM Lecture";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Lecturer");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("empid") + "-" + rs.getString("empname"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Lecturer not load correctly... " + e);

        }
    }
    
    public void loadSessionCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT id, subject FROM session";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Session");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("id") + "-" + rs.getString("subject"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Session not load correctly... " + e);

        }
    }
    
    public void loadGroupCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT GrpNum FROM GroupNumGenerate";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Group");
            
            while(rs.next()) {

                jComboBox.addItem(rs.getString("GrpNum"));

            }
        } 
        
        catch(Exception e) {

            System.out.println("Group not load correctly... " + e);

        }
    }
    
    public void loadSubGroupCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT SubGrpGenName FROM SubGrpGenerate";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Sub Group");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("SubGrpGenName"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Sub Group not load correctly... " + e);

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
            
            String sql1 = "SELECT COUNT(id) AS count FROM notAvailableTime";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            String dataArray[][] = new String[count][8];
            
            String sql2 = "SELECT id, lecturer, session, stuGroup, subGroup, date, start, end FROM notAvailableTime";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                dataArray[i][0] = rs.getString("id");
                dataArray[i][1] = rs.getString("lecturer");
                dataArray[i][2] = rs.getString("session");
                dataArray[i][3] = rs.getString("stuGroup");
                dataArray[i][4] = rs.getString("subGroup");
                dataArray[i][5] = rs.getString("date");
                dataArray[i][6] = rs.getString("start");
                dataArray[i][7] = rs.getString("end"); 
                
                i++;
                
            }
            
            String col[] = {"ID", "Lecturer", "Session", "Group", "Sub Group", "Date", "Start Time", "End Time"};

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
            jTable.getColumnModel().getColumn(5);
            jTable.getColumnModel().getColumn(6);
            jTable.getColumnModel().getColumn(7);
                        
        } 
        
        catch(Exception e) {
            
            System.out.println("Not Available Time Information not load correctly... " + e);
            
        }        
    }
    
    public boolean validateDuplicate(String value, String date, int startHour, int endHour, int startMinute, int endMinute, int type) {
        
        try {
			
            boolean isValid = true;
            int startTimeHour = 0;
            int endTimeHour = 0;
            int startTimeMinute = 0;
            int endTimeMinute = 0;
	
            String sql = null;
            
            switch (type) {
                case 0:
                    sql = "SELECT start, end FROM notAvailableTime WHERE lecturer = '" + value + "' AND date = '" + date + "'";
                    break;
				
                case 1:
                    sql = "SELECT start, end FROM notAvailableTime WHERE session = '" + value + "' AND date = '" + date + "'";
                    break;
				
                case 2:
                    sql = "SELECT start, end FROM notAvailableTime WHERE stuGroup = '" + value + "' AND date = '" + date + "'";
                    break;
				
                case 3:
                    sql = "SELECT start, end FROM notAvailableTime WHERE subGroup = '" + value + "' AND date = '" + date + "'";
                    break;
				
                default:
                    sql = "SELECT start, end FROM notAvailableTime";
                    break;
            }
	
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
			
            while(rs.next()) {
				
                String st = rs.getString("start");
                String et = rs.getString("end");
                
                String startTime[] = st.split("\\:");
                String endTime[] = et.split("\\:"); 
		
                startTimeHour = Integer.parseInt(startTime[0]);
		startTimeMinute = Integer.parseInt(startTime[1]);
		endTimeHour = Integer.parseInt(endTime[0]);
		endTimeMinute = Integer.parseInt(endTime[1]);
		
            }
	
            if(startTimeHour != 0) {
                
                if((startHour == startTimeHour) && (startMinute == startTimeMinute)) {

                    isValid = false;

                }

                else if((startTimeHour < startHour) && (endTimeHour > startHour)) {

                    isValid = false;

                }

                else {

                    isValid = true;

                }
            }
            
            else {
            
                isValid = true;
                
            }
	
            return isValid;
		
        }
	
        catch(Exception e) {
	
            return false;
	
        }
    }
	
    public boolean insertNotAvailableTime(NotAvailableTimeModel model) {
    
        boolean success;
        
        try {
          
            String sql = "INSERT INTO notAvailableTime(id, lecturer, session, stuGroup, subGroup, date, start, end) VALUES('" + createId() + "', '" + model.getLecturer() + "', '" + model.getSession() + "', '" + model.getGroup() + "', '" + model.getSubGroup() + "', '" + model.getDate() + "', '" + model.getStartTime() + "', '" + model.getEndTime() + "')";
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

    public boolean deleteNotAvailableTime(String id) {
    
        boolean success;
        
        try {
            
            String sql = "DELETE FROM notAvailableTime WHERE id = '" + id + "'";
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