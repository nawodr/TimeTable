package Session;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class SessionController {

    Connection con = DBConnection.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;
    
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
    
    public void loadTagCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT tagName FROM Tag";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Tag");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("tagName"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Tag not load correctly... " + e);

        }
    }
    
    public void loadGroupCombo(JComboBox jComboBox, boolean withSubGroup) {

        try {

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Student Group");
            
            if(withSubGroup) {
            
                String sql1 = "SELECT DISTINCT SubGrpGenName FROM SubGrpGenerate";
                pst = con.prepareStatement(sql1);
                rs = pst.executeQuery();

                while(rs.next()) {

                    jComboBox.addItem(rs.getString("SubGrpGenName"));

                }
            }
            
            else {
            
                String sql2 = "SELECT DISTINCT GrpNum FROM GroupNumGenerate";
                pst = con.prepareStatement(sql2);
                rs = pst.executeQuery();

                while(rs.next()) {

                    jComboBox.addItem(rs.getString("GrpNum"));

                }
            }
        } 
        
        catch(Exception e) {

            System.out.println("Group not load correctly... " + e);

        }
    }
    
    public void loadSubjectCombo(JComboBox jComboBox) {

        try {

            String sql = "SELECT DISTINCT mcode, mname FROM Module";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            jComboBox.removeAllItems();
            jComboBox.addItem("Select Subject");

            while(rs.next()) {

                jComboBox.addItem(rs.getString("mcode") + "-" + rs.getString("mname"));
                
            }
        } 
        
        catch(Exception e) {

            System.out.println("Subject not load correctly... " + e);

        }
    }
    
    public void loadSessionTable(JTable jTable) {

        try {
            
            int count = 0;
            
            String sql1 = "SELECT COUNT(id) AS count FROM session";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {
            
                count = Integer.parseInt(rs.getString("count"));
                                
            }
            
            String dataArray[][] = new String[count][10];
            
            String sql2 = "SELECT id, subject, sub_code, tag, tag_duration, group_id, stu_count FROM session";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                dataArray[i][0] = rs.getString("id");
                dataArray[i][1] = "";
                dataArray[i][2] = "";
                dataArray[i][3] = "";
                dataArray[i][4] = rs.getString("sub_code");
                dataArray[i][5] = rs.getString("subject");
                dataArray[i][6] = rs.getString("group_id");
                dataArray[i][7] = rs.getString("stu_count");
                dataArray[i][8] = rs.getString("tag");
                dataArray[i][9] = rs.getString("tag_duration");
                           
                i++;
                
            }
            
            if(dataArray.length > 0) {
            
                for(int r = 0; r < dataArray.length; r++) {
                
                    String sql3 = "SELECT S.lId, L.empname FROM sessionLec S, Lecture L WHERE S.sId = '" + dataArray[r][0] + "' AND S.lId = L.empid";
                    pst = con.prepareStatement(sql3);
                    rs = pst.executeQuery();

                    int k = 1;

                    while(rs.next()) {

                        dataArray[r][k] = rs.getString("lId") + "-" + rs.getString("empname");                                

                        k++;

                    }
                }
            }
            
            String col[] = {"ID", "Lecturer 1", "Lecturer 2", "Lecturer 3", "Subject Code", "Subject Name", "Group Id", "No of Student", "Tag", "Duration"};

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
            jTable.getColumnModel().getColumn(8);
            jTable.getColumnModel().getColumn(9);
                        
        } 
        
        catch(Exception e) {
            
            System.out.println("Session Information not load correctly... " + e);
            
        }        
    }
    
    public void searchSession(JTable jTable, String value, int type) {

        try {
            
            int count = 0;
            String sql1 = null;
            String sql2 = null;
            
            switch (type) {
                case 0:
                    sql1 = "SELECT COUNT(id) AS count FROM session WHERE id = '" + value + "'";
                    sql2 = "SELECT id, subject, sub_code, tag, tag_duration, group_id, stu_count FROM session WHERE id = '" + value + "'";
                    break;
                
                case 1:
                    sql1 = "SELECT COUNT(id) AS count FROM session WHERE sub_code = '" + value + "'";
                    sql2 = "SELECT id, subject, sub_code, tag, tag_duration, group_id, stu_count FROM session WHERE sub_code = '" + value + "'";
                    break;
                
                case 2:
                    sql1 = "SELECT COUNT(id) AS count FROM session WHERE group_id = '" + value + "'";
                    sql2 = "SELECT id, subject, sub_code, tag, tag_duration, group_id, stu_count FROM session WHERE group_id = '" + value + "'";
                    break;
                
                case 3:
                    sql1 = "SELECT COUNT(id) AS count FROM session WHERE tag = '" + value + "'";
                    sql2 = "SELECT id, subject, sub_code, tag, tag_duration, group_id, stu_count FROM session WHERE tag = '" + value + "'";
                    break;
                
                default:
                    sql1 = "SELECT COUNT(id) AS count FROM session";
                    sql2 = "SELECT id, subject, sub_code, tag, tag_duration, group_id, stu_count FROM session";
                    break;
            }
            
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();

            while(rs.next()) {

                count = Integer.parseInt(rs.getString("count"));

            }
            
            String dataArray[][] = new String[count][10];
            
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            int i = 0;
            
            while(rs.next()) {
               
                dataArray[i][0] = rs.getString("id");
                dataArray[i][1] = "";
                dataArray[i][2] = "";
                dataArray[i][3] = "";
                dataArray[i][4] = rs.getString("sub_code");
                dataArray[i][5] = rs.getString("subject");
                dataArray[i][6] = rs.getString("group_id");
                dataArray[i][7] = rs.getString("stu_count");
                dataArray[i][8] = rs.getString("tag");
                dataArray[i][9] = rs.getString("tag_duration");
                            
                String sql3 = "SELECT S.lId, L.empname FROM sessionLec S, Lecture L WHERE S.sId = '" + rs.getString("id") + "' AND S.lId = L.empid";
                pst = con.prepareStatement(sql3);
                rs = pst.executeQuery();
            
                int k = 1;
                
                while(rs.next()) {
               
                    dataArray[i][k] = rs.getString("lId") + "-" + rs.getString("empname");                                
                
                    k++;
                    
                }
            
                i++;
                
            }
            
            String col[] = {"ID", "Lecturer 1", "Lecturer 2", "Lecturer 3", "Subject Code", "Subject Name", "Group Id", "No of Student", "Tag", "Duration"};

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
            jTable.getColumnModel().getColumn(8);
            jTable.getColumnModel().getColumn(9);
                        
        } 
        
        catch(Exception e) {
            
            System.out.println("Session Information not load correctly... " + e);
            
        }        
    }
    
    public boolean insertSession(SessionModel model) {
    
        boolean success;
        
        try {
            
            String sql1 = "INSERT INTO session(subject, sub_code, tag, tag_duration, group_id, subgroup_id, stu_count) VALUES('" + model.getSubject() + "', '" + model.getSub_code() + "', '" + model.getTag() + "', '" + model.getTag_duration() + "', '" + model.getGroup_id() + "', '" + model.getSubgroup_id() + "', '" + model.getStu_count() + "')";
            pst = con.prepareStatement(sql1);
            pst.execute();
            
            String sql2 = "SELECT id FROM session ORDER BY id DESC LIMIT 1";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            
            while(rs.next()) {

                String lecArray[] = model.getLecturers().split(" ");
                
                for(int i = 0; i < lecArray.length; i++) {
                
                    String lecId[] = lecArray[i].split("-");
                    
                    String sql3 = "INSERT INTO sessionLec(sId, lId) VALUES('" + rs.getString("id") + "', '" + lecId[0] + "')";
                    pst = con.prepareStatement(sql3);
                    pst.execute();
                    
                }
            }
            
            success = true;
                        
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't save record details proparly... " + e);
            
        }
                        
        return success;
        
    }

    public boolean updateSession(SessionModel model) {
    
        boolean success;
        
        try {
              
            String sql = "UPDATE session SET subject = '" + model.getSubject() + "', sub_code = '" + model.getSub_code() + "', tag = '" + model.getTag() + "', tag_duration = '" + model.getTag_duration() + "', group_id = '" + model.getGroup_id() + "', subgroup_id = '" + model.getSubgroup_id() + "', stu_count = '" + model.getStu_count() + "' WHERE id = '" + model.getId() + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            String sql2 = "DELETE FROM sessionLec WHERE sId = '" + model.getId() + "'";
            pst = con.prepareStatement(sql2);
            pst.execute();
            
            String lecArray[] = model.getLecturers().split(" ");
                
            for(int i = 0; i < lecArray.length; i++) {
                
                String lecId[] = lecArray[i].split("-");
                    
                String sql3 = "INSERT INTO sessionLec(sId, lId) VALUES('" + model.getId() + "', '" + lecId[0] + "')";
                pst = con.prepareStatement(sql3);
                pst.execute();
                
            }
                
            success = true;
                        
        } 
        
        catch(Exception e) {
        
            success = false;
            System.out.println("Can't update record details proparly... " + e);
            
        }
                        
        return success;
        
    }
        
    public boolean deleteSession(int id) {
    
        boolean success;
        
        try {
            
            String sql1 = "DELETE FROM session WHERE id = '" + id + "'";
            pst = con.prepareStatement(sql1);
            pst.execute();
            
            String sql2 = "DELETE FROM sessionLec WHERE sId = '" + id + "'";
            pst = con.prepareStatement(sql2);
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