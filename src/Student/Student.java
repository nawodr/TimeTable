/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author RPsandeepa
 */
public class Student {
    
    private int id;
    private String acedmicYearAndSem;
    private String degreeProgram;
    private String groupNumber;
    private String subGroupNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setAcedmicYearAndSem(String acedmicYearAndSem) {
        this.acedmicYearAndSem = acedmicYearAndSem;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setSubGroupNumber(String subGroupNumber) {
        this.subGroupNumber = subGroupNumber;
    }

    public int getId() {
        return id;
    }

    public String getAcedmicYearAndSem() {
        return acedmicYearAndSem;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public String getSubGroupNumber() {
        return subGroupNumber;
    }
    
}
