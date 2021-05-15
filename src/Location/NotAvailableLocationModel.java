package Location;

public class NotAvailableLocationModel {
    
    String room;
    String date;
    String startTime;
    String endTime;
    
    public NotAvailableLocationModel() {
    }

    public NotAvailableLocationModel(String room, String date, String startTime, String endTime) {
       
        this.room = room;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    
    }

    public String getRoom() {
        
        return room;
    
    }

    public void setRoom(String room) {
       
        this.room = room;
    
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
