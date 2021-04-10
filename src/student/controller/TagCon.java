/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.controller;

import java.sql.SQLException;
import student.model.TagModel;


/**
 *
 * @author RPsandeepa
 */
public class TagCon {
    
    TagModel tagm = new TagModel();
    
    public int addHandleClick(String tag_name, String tag_code, String tag) throws SQLException{
        return tagm.insert(tag_name, tag_code, tag);
    }
    
    public boolean getAllReady(String tag_name, String tag_code, String tag) throws SQLException{
        return  tagm.isCheckAS(tag_name, tag_code, tag);
    }
    
    public int updateHandleClick(int final_id, String tag_name, String tag_code, String tag) throws SQLException{
        return tagm.update(final_id, tag_name, tag_code, tag);
    }
    
    public int deleteHandleClick(int final_id) throws SQLException{
        return tagm.delete(final_id);
    }
    
    
}
