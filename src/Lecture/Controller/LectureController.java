/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture.Controller;

import DB.DBConnection;
import Lecture.Model.LectureModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charith Madushan
 */
public class LectureController {

/*
    Add lecture Details
     */
    public int addLecture(LectureModel lecture) throws SQLException {
        
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
        
        int lectureId = 0;
        
        try {
            ps = connection.prepareStatement("INSERT INTO Lecture "
                    + "(empid,empname,faculty,department,center,building,level,rank) "
                    + "VALUES (?,?,?,?,?,?,?,?)");
            
            // set db value
            ps.setInt(1, lecture.getEmpid());
            ps.setString(2, lecture.getEmpname());
            ps.setString(3, lecture.getFaculty());
            ps.setString(4, lecture.getDepartment());
            ps.setString(5, lecture.getCenter());
            ps.setString(6, lecture.getBuilding());
            ps.setInt(7, lecture.getLevel());
            ps.setInt(8, lecture.getRank());
            
            lectureId = ps.executeUpdate();
            
    

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
        return lectureId;
    }
    
    
        public void updateLecture(LectureModel lecture) throws SQLException {
        
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
        
        int updatelecture = 0;
        
        try {
            ps = connection.prepareStatement("UPDATE Lecture SET empid = ?,empname = ?,faculty = ?,department = ?,center =?,building = ?,level = ?,rank =? Where id = ?");
            
            // set db value
            ps.setInt(1, lecture.getEmpid());
            ps.setString(2, lecture.getEmpname());
            ps.setString(3, lecture.getFaculty());
            ps.setString(4, lecture.getDepartment());
            ps.setString(5, lecture.getCenter());
            ps.setString(6, lecture.getBuilding());
            ps.setInt(7, lecture.getLevel());
            ps.setInt(8, lecture.getRank());
            ps.setInt(9, lecture.getId());
            
            updatelecture = ps.executeUpdate();
            
    

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
        
    }

        
        
    public int DeleteLecture(int id) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        int lectureDel = 0;
        
        try {
            ps = connection.prepareStatement("DELETE FROM Lecture WHERE id = ?");
            ps.setInt(1, id);
            lectureDel =  ps.executeUpdate();
        
        } catch (SQLException ex) {
            throw ex;
        } finally {
            try {
                if(ps != null){
                    ps.close();
                }
            } catch (SQLException ex) {
                throw ex;
            }
        }
        
        return lectureDel;
    }
    
    
     /*
     Show Customer List
     */
    public List<LectureModel> ShowLectureList() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<LectureModel> LectureList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT id,empid,empname,faculty,department,center,building,level,rank FROM Lecture ORDER BY id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                LectureModel lec = new LectureModel();

                lec.setId(rs.getInt("id"));
                lec.setEmpid(rs.getInt("empid"));
                lec.setEmpname(rs.getString("empname"));
               lec.setFaculty(rs.getString("faculty"));
                lec.setDepartment(rs.getString("department"));
                lec.setCenter(rs.getString("center"));
               lec.setBuilding(rs.getString("building"));
               lec.setLevel(rs.getInt("level"));
                lec.setRank(rs.getInt("rank"));

                //add object to arraylist
                LectureList.add(lec);
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
        return LectureList;
    }
}


