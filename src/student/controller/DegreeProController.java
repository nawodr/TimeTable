/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import java.sql.SQLException;
import student.model.DegreePro;

/**
 *
 * @author Administrator
 */
public class DegreeProController {
    
    DegreePro dp = new DegreePro();
    
    public int btn_deg_proHandleClick(String deg_pro) throws SQLException{
        return dp.insert(deg_pro);
    }
    
    public boolean getAllReady(String degPro) throws SQLException{
        return  dp.isCheckAS(degPro);
    }
    
    public int updateHandleClick(int final_id, String deg_pro) throws SQLException{
        return dp.update(final_id, deg_pro);
    }
    
    public int deleteHandleClick(int final_id) throws SQLException{
        return dp.delete(final_id);
    }
}
