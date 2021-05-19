package timetable.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nawod
 */
public class GroupId {
    
       public int getIdGrpNumGen() {
        return idGrpNumGen;
    }

    public void setIdGrpNumGen(int idGrpNumGen) {
        this.idGrpNumGen = idGrpNumGen;
    }

    public String getGrpNum() {
        return GrpNum;
    }

    public void setGrpNum(String GrpNum) {
        this.GrpNum = GrpNum;
    }

    public String getyNsId() {
        return yNsId;
    }

    public void setyNsId(String yNsId) {
        this.yNsId = yNsId;
    }

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getGnoId() {
        return gnoId;
    }

    public void setGnoId(String gnoId) {
        this.gnoId = gnoId;
    }
    
    int idGrpNumGen;
    String GrpNum;
    String yNsId;
    String dpId;
    String gnoId;
    
    
}
