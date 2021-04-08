/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import java.sql.SQLException;
import student.model.GroupNum;

/**
 *
 * @author RPsandeepa
 */
public class GroupController {
    
    GroupNum gn = new GroupNum();
    
    public int addHandleClick(String grp_num) throws SQLException{
        return gn.insert(grp_num);
    }
    
    public boolean getAllReady(String grp_num) throws SQLException{
        return  gn.isCheckAS(grp_num);
    }
    
    public int updateHandleClick(int final_id, String grp_num) throws SQLException{
        return gn.update(final_id, grp_num);
    }
    
    public int deleteHandleClick(int final_id) throws SQLException{
        return gn.delete(final_id);
    }
}
