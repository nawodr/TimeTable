/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import java.sql.SQLException;
import student.model.AcdYerAndSem;

/**
 *
 * @author RPsandeepa
 */
public class YearSemController {
    
    AcdYerAndSem ac = new AcdYerAndSem();
    
    public int addHandleClick(String deg_pro) throws SQLException{
        return ac.insert(deg_pro);
    }
    
    public boolean getAllReady(String degPro) throws SQLException{
        return  ac.isCheckAS(degPro);
    }
    
    public int updateHandleClick(int final_id, String yer_sem) throws SQLException{
        return ac.update(final_id, yer_sem);
    }
    
    public int deleteHandleClick(int final_id) throws SQLException{
        return ac.delete(final_id);
    }
    
}
