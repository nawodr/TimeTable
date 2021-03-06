package WorkingDays;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class WorkingDaysandHoursController {

    Connection con = DBConnection.getConnection();;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void loadNoOfDaysCombo(JComboBox jComboBox) {

        try {

            jComboBox.removeAllItems();
            
            for(int i = 0; i < 8; i++) {

                jComboBox.addItem(String.valueOf(i));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("No of days not load correctly... " + e);

        }
    }
    
    public void loadHoursCombo(JComboBox jComboBox, int requestType) {

        try {

            jComboBox.removeAllItems();
            
            int startIndex;
            
            if(requestType == 1) {
            
                startIndex = 0;
                
            } 
            
            else {
            
                startIndex = 1;
                
            }
            
            for(int i = startIndex; i < 24; i++) {

                jComboBox.addItem(String.valueOf(i));
                
            }
            
            if(requestType == 1) {
            
                jComboBox.addItem("0");
                
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
    
    public int[] loadWorkingDaysTable(JTable jTable) {

        try {
            
            int count = 0;
            
            String sql1 = "SELECT COUNT(id) AS count FROM workingdays";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            int idList[] = new int[count];
            String dataArray[][] = new String[count][4];
            
            String sql2 = "SELECT id, noOfWorkingDays, workingDays, workingHours FROM workingdays";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                dataArray[i][0] = String.valueOf(i + 1);
                dataArray[i][1] = rs.getString("noOfWorkingDays");
                dataArray[i][2] = rs.getString("workingDays");
                dataArray[i][3] = rs.getString("workingHours");
                                
                idList[i] = Integer.parseInt(rs.getString("id"));
                
                i++;
                
            }
            
            String col[] = {"#", "No of Working Days", "Working Days", "Working Hours"};

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
            jTable.getColumnModel().getColumn(3);
            
            return idList;
            
        } 
        
        catch(Exception e) {
            
            System.out.println("Working Days Information not load correctly... " + e);
            return null;
            
        }        
    }
    
    public int[][] loadTimeSlotsTable(JTable jTable) {

        try {
            
            int count = 0;
            
            String sql1 = "SELECT COUNT(id) AS count FROM timeslots";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            int idList[][] = new int[count][2];
            String dataArray[][] = new String[count][5];
            
            String sql2 = "SELECT id, date, start, end, slotType FROM timeslots";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                dataArray[i][0] = String.valueOf(i + 1);
                dataArray[i][1] = rs.getString("date");
                dataArray[i][2] = rs.getString("start");
                dataArray[i][3] = rs.getString("end");
                
                idList[i][0] = Integer.parseInt(rs.getString("id"));
                idList[i][1] = Integer.parseInt(rs.getString("slotType"));       
                
                i++;
                
            }
            
            String col[] = {"#", "Date", "Start", "End"};

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
            
            return idList;
            
        } 
        
        catch(Exception e) {
            
            System.out.println("Time slots Information not load correctly... " + e);
            return null;
            
        }        
    }
    
    public boolean validateDuplicate(String date, int startHour, int endHour, int startMinute, int endMinute) {
        
        try {
            
            boolean isValid = true;
            
            int count = 0;
            
            String sql1 = "SELECT COUNT(id) AS count FROM timeslots WHERE date = '" + date + "'";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            int startTimeHour[] =  new int[count];
            int endTimeHour[] =  new int[count];
            int startTimeMinute[] =  new int[count];
            int endTimeMinute = 0;

            String sql = "SELECT start, end FROM timeslots WHERE date = '" + date + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            int i = 0;
            
            while(rs.next()) {

                System.err.println(rs.getString("start"));
                String st = rs.getString("start");
                String et = rs.getString("end");
                
                String startTime[] = st.split("\\:");
                String endTime[] = et.split("\\:"); 

		startTimeHour[i] = Integer.parseInt(startTime[0]);
		startTimeMinute[i] = Integer.parseInt(startTime[1]);
		endTimeHour[i] = Integer.parseInt(endTime[0]);
		endTimeMinute = Integer.parseInt(endTime[1]);
	                
                i++;
                
            }
		
            if(startTimeHour.length > 0) {
                
                for(int k = 0; k < count; k++) {
                
                    if((startHour == startTimeHour[k]) && (startMinute == startTimeMinute[k])) {

                        isValid = false;

                    }

                    else if((startTimeHour[k] < startHour) && (endTimeHour[k] > startHour)) {

                        isValid = false;

                    }

                    else {

                        isValid = true;

                    }
                }
            }
            
            else {
            
                isValid = true;
                
            }
            
            return isValid;
        
        }
        
        catch(Exception e) {
        
            System.err.println(e);
            return false;
            
        }
    }
    
    public boolean insertWorkingDays(WorkingDaysModel workingDaysModel) {
    
        boolean success;
        
        try {
            
            String sql = "INSERT INTO workingdays(noOfWorkingDays, workingDays, workingHours, workingMin) VALUES('" + workingDaysModel.getNoOfWorkingDays() + "', '" + workingDaysModel.getWorkingDays() + "', '" + workingDaysModel.getWorkingHours() + "', '" + workingDaysModel.getWorkingMin()+ "')";
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

    public boolean insertTimeSlots(TimeSlotsModel timeSlotsModel) {
    
        boolean success;
        
        try {
            
            String sql = "INSERT INTO timeslots(date, start, end, slotType) VALUES('" + timeSlotsModel.getDate() + "', '" + timeSlotsModel.getStart() + "', '" + timeSlotsModel.getEnd() + "', '" + timeSlotsModel.getSlotType() + "')";
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
    
    public boolean updateWorkingDays(WorkingDaysModel workingDaysModel) {
    
        boolean success;
        
        try {
            
            String sql = "UPDATE workingdays SET noOfWorkingDays = '" + workingDaysModel.getNoOfWorkingDays() + "', workingDays = '" + workingDaysModel.getWorkingDays() + "', workingHours = '" + workingDaysModel.getWorkingHours() +  "', workingMin = '" + workingDaysModel.getWorkingMin()+ "' WHERE id = '" + workingDaysModel.getId() + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            success = true;
                        
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't update record details proparly... " + e);
            
        }
                        
        return success;
        
    }
    
    public boolean updateTimeSlots(TimeSlotsModel timeSlotsModel) {
    
        boolean success;
        
        try {
            
            String sql = "UPDATE timeslots SET date = '" + timeSlotsModel.getDate() + "', start = '" + timeSlotsModel.getStart() + "', end = '" + timeSlotsModel.getEnd() + "', slotType = '" + timeSlotsModel.getSlotType() + "' WHERE id = '" + timeSlotsModel.getId() + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            success = true;
                        
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't update record details proparly... " + e);
            
        }
                        
        return success;
        
    }
    
    public boolean deleteWorkingDays(int id) {
    
        boolean success;
        
        try {
            
            String sql = "DELETE FROM workingdays WHERE id = '" + id + "'";
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
    
    public boolean deleteTimeSlots(int id) {
    
        boolean success;
        
        try {
            
            String sql = "DELETE FROM timeslots WHERE id = '" + id + "'";
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