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
public class Working_days_hours {

    private int id;
    private String noOfWorkingDays;
    private String workingDays;
    private String workingHours;
    private String workingMin;

    public void setWorkingMin(String workingMin) {
        this.workingMin = workingMin;
    }

    public String getWorkingMin() {
        return workingMin;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNoOfWorkingDays(String noOfWorkingDays) {
        this.noOfWorkingDays = noOfWorkingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
    
    public int getId() {
        return id;
    }

    public String getNoOfWorkingDays() {
        return noOfWorkingDays;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public String getWorkingHours() {
        return workingHours;
    }
}
