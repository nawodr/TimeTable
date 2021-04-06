/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author hvdil
 */
public class YnS {
    
    private int idAcdYerAndSem;
    private String yerName;

    public YnS() {
    }
    
    
    public YnS(int ID, String yNs){
        this.idAcdYerAndSem = ID;
        this.yerName = yNs;
    } 
    
    public int getId()
    {
        return idAcdYerAndSem;
    }
    
    public String getYnS()
    {
        return yerName;
    }
    
}
