/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import java.sql.SQLException;
import student.model.GroupNumGenerate;
import student.model.SubGrpIdGen;
import student.view.SubGrpIdGenerate;

/**
 *
 * @author Administrator
 */
public class SubGrpIdGenCont {
    
    SubGrpIdGen sgg = new SubGrpIdGen();

    public int addHandleClick(String subId) throws SQLException {
        return sgg.insert(subId);
    }

    public boolean getAllReady(String subId) throws SQLException {
        return sgg.isCheckAS(subId);
    }

    public int updateHandleClick(int final_id, String subId) throws SQLException {
        return sgg.update(final_id, subId);
    }
    
    public int deleteHandleClick(int final_id) throws SQLException{
        return sgg.delete(final_id);
    }
    
}
