/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import java.sql.SQLException;
import student.model.SubGrpNum;

/**
 *
 * @author RPsandeepa
 */
public class SubGrpController {
    
    SubGrpNum sb = new SubGrpNum();
    
    public int addHandleClick(String sub_grp_num) throws SQLException{
        return sb.insert(sub_grp_num);
    }
    
    public boolean getAllReady(String sub_grp_num) throws SQLException{
        return  sb.isCheckAS(sub_grp_num);
    }
    
    public int updateHandleClick(int final_id, String yer_sem) throws SQLException{
        return sb.update(final_id, yer_sem);
    }
    
    public int deleteHandleClick(int final_id) throws SQLException{
        return sb.delete(final_id);
    }
}
