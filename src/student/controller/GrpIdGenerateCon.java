/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import java.sql.SQLException;
import student.model.GroupNumGenerate;

/**
 *
 * @author RPsandeepa
 */
public class GrpIdGenerateCon {

    GroupNumGenerate gng = new GroupNumGenerate();

    public int addHandleClick(String groupId) throws SQLException {
        return gng.insert(groupId);
    }

    public boolean getAllReady(String groupId) throws SQLException {
        return gng.isCheckAS(groupId);
    }

    public int updateHandleClick(int final_id, String deg_pro) throws SQLException {
        return gng.update(final_id, deg_pro);
    }
    
    public int deleteHandleClick(int final_id) throws SQLException{
        return gng.delete(final_id);
    }

}
