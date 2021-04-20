/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module.Model;

/**
 *
 * @author Charith Madushan
 */
public class ModuleModel {
    
    private int id;
    private String offeredyear;
    private String offeredsem;
    private String mname;
    private String mcode;
    private int lechrs;
    private int thrs;
    private int labhrs;
    private int evahrs;
    
    
    public int getId() {
        return id;
    }

    public String getOfferedyear() {
        return offeredyear;
    }

    public String getOfferedsem() {
        return offeredsem;
    }

    public String getMname() {
        return mname;
    }

    public String getMcode() {
        return mcode;
    }

    public int getLechrs() {
        return lechrs;
    }

    public int getThrs() {
        return thrs;
    }

    public int getLabhrs() {
        return labhrs;
    }

    public int getEvahrs() {
        return evahrs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOfferedyear(String offeredyear) {
        this.offeredyear = offeredyear;
    }

    public void setOfferedsem(String offeredsem) {
        this.offeredsem = offeredsem;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    public void setLechrs(int lechrs) {
        this.lechrs = lechrs;
    }

    public void setThrs(int thrs) {
        this.thrs = thrs;
    }

    public void setLabhrs(int labhrs) {
        this.labhrs = labhrs;
    }

    public void setEvahrs(int evahrs) {
        this.evahrs = evahrs;
    }


}
