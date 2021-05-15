package Session;

public class NotAvailableTimeModel {
    
    String lecturer;
    String session;
    String group;
    String subGroup;
    String date;
    String startTime;
    String endTime;
    
    public NotAvailableTimeModel() {
    }

    public NotAvailableTimeModel(String lecturer, String session, String group, String subGroup, String date, String startTime, String endTime) {
        
        this.lecturer = lecturer;
        this.session = session;
        this.group = group;
        this.subGroup = subGroup;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    
    }

    public String getLecturer() {
        
        return lecturer;
    
    }

    public void setLecturer(String lecturer) {
        
        this.lecturer = lecturer;
    
    }

    public String getSession() {
        
        return session;
    
    }

    public void setSession(String session) {
        
        this.session = session;
    
    }

    public String getGroup() {
        
        return group;
    
    }

    public void setGroup(String group) {
        
        this.group = group;
    
    }

    public String getSubGroup() {
        
        return subGroup;
    
    }

    public void setSubGroup(String subGroup) {
        
        this.subGroup = subGroup;
    
    }

    public String getDate() {
        
        return date;
    
    }

    public void setDate(String date) {
        
        this.date = date;
    
    }

    public String getStartTime() {
        
        return startTime;
    
    }

    public void setStartTime(String startTime) {
        
        this.startTime = startTime;
    
    }

    public String getEndTime() {
        
        return endTime;
    
    }

    public void setEndTime(String endTime) {
        
        this.endTime = endTime;
    
    }
}
