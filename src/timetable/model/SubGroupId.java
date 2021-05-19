/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.model;

/**
 *
 * @author Nawod
 */
public class SubGroupId {

    public int getIdSubGrpGen() {
        return idSubGrpGen;
    }

    public void setIdSubGrpGen(int idSubGrpGen) {
        this.idSubGrpGen = idSubGrpGen;
    }

    public String getSubGrpGenName() {
        return SubGrpGenName;
    }

    public void setSubGrpGenName(String SubGrpGenName) {
        this.SubGrpGenName = SubGrpGenName;
    }

    public String getsGno() {
        return sGno;
    }

    public void setsGno(String sGno) {
        this.sGno = sGno;
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    int idSubGrpGen;
    String SubGrpGenName;
    String sGno;
    String gId;
}
