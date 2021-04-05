/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import Student.Student;
import java.sql.PreparedStatement;

/**
 *
 * @author RPsandeepa
 */
public class Students_controller {
    
//    DBConnection con = null;
    
    
    public  int addAceYerAndSem(Add_year_and_sem_model add_year_and_sem) throws Exception{
        ResultSet rs = null;
        PreparedStatement ps = null;
        int yer_and_semID = 0;
        
        try {
            Connection connection = DBConnection.getConnection();
            
            ps = connection.preparStatement("INSERT INTO AcdYerAndSem "
                    + "("+"yerName"+") VALUES(?)"
                    , PreparedStatement.RETURN_GENERATED_KEYS);
            
            //set variable into query
            
            ps.setString(1, add_year_and_sem.getYerName());
            
            rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                int idAcdYerAndSem = rs.getInt(1);
                add_year_and_sem.setIdAcdYerAndSem(idAcdYerAndSem);
            }
        } catch (Exception e) {
            throw  e;
        }
        finally{
            try {
                if (ps != null){
                    ps.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }
        
        return yer_and_semID;
    }
    
}
