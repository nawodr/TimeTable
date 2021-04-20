/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module.Controller;


import DB.DBConnection;
import Module.Model.ModuleModel;
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
public class ModuleController {
    
    public int addModule(ModuleModel module) throws SQLException {
        
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
        
        int moduleId = 0;
        
        try {
            ps = connection.prepareStatement("INSERT INTO Module "
                    + "(offeredyear,offeredsem,mname,mcode,lechrs,thrs,labhrs,evahrs) "
                    + "VALUES (?,?,?,?,?,?,?,?)");
            
            // set db value
            ps.setString(1, module.getOfferedyear());
            ps.setString(2, module.getOfferedsem());
            ps.setString(3, module.getMname());
            ps.setString(4, module.getMcode());
            ps.setInt(5, module.getLechrs());
            ps.setInt(6, module.getThrs());
            ps.setInt(7, module.getLabhrs());
            ps.setInt(8, module.getEvahrs());
            
            moduleId = ps.executeUpdate();

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
        return moduleId;
    }
    
    
    public void updateModel(ModuleModel module)throws SQLException{
        
        int updatemodule = 0;
        PreparedStatement ps = null;
        Connection connection = DBConnection.getConnection();
       
     
     
        try {
            ps = connection.prepareStatement("UPDATE Module SET offeredyear = ?,offeredsem = ?,mname = ?,mcode = ?,lechrs =?,thrs = ?,labhrs = ?,evahrs =? Where id = ?");
            // set db value
            ps.setString(1, module.getOfferedyear());
            ps.setString(2, module.getOfferedsem());
            ps.setString(3, module.getMname());
            ps.setString(4, module.getMcode());
            ps.setInt(5, module.getLechrs());
            ps.setInt(6, module.getThrs());
            ps.setInt(7, module.getLabhrs());
            ps.setInt(8, module.getEvahrs());
            ps.setInt(9, module.getId());
            
            updatemodule = ps.executeUpdate();

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
    
 public int DeleteModule(int id) throws SQLException {
        
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        
        int moduleDel = 0;
        
        try {
            ps = connection.prepareStatement("DELETE FROM Module WHERE id = ?");
            ps.setInt(1, id);
            moduleDel =  ps.executeUpdate();
        
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
        
        return moduleDel;
    }
    
     /*
     Show Customer List
     */
    public List<ModuleModel> ShowModuleList() throws SQLException {
    
        Connection connection = DBConnection.getConnection();
        PreparedStatement ps = null;
        List<ModuleModel> ModuleList = new ArrayList();
        
        try {
            ps = connection.prepareStatement("SELECT id,offeredyear,offeredsem,mname,mcode,lechrs,thrs,labhrs,evahrs FROM Module ORDER BY id");
            //excuite sql
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // create objct & set db value
                ModuleModel mod = new ModuleModel();

                mod.setId(rs.getInt("id"));
                mod.setOfferedyear(rs.getString("offeredyear"));
                mod.setOfferedsem(rs.getString("offeredsem"));
                mod.setMname(rs.getString("mname"));
                mod.setMcode(rs.getString("mcode"));
                mod.setLechrs(rs.getInt("lechrs"));
                mod.setThrs(rs.getInt("thrs"));
                mod.setLabhrs(rs.getInt("labhrs"));
                mod.setEvahrs(rs.getInt("evahrs"));

                //add object to arraylist
                ModuleList.add(mod);
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
        return ModuleList;
    }
  
}
