package WorkingDays;

public class TimeSlotsModel {
    
    int id;
    String date;
    String start;
    String end;
    int slotType;
    
    public TimeSlotsModel() {
    }

    public TimeSlotsModel(String date, String start, String end, int slotType) {
              
        this.date = date;
        this.start = start;
        this.end = end;
        this.slotType = slotType;
    
    }

    public TimeSlotsModel(int id, String date, String start, String end, int slotType) {
    
        this.id = id;
        this.date = date;
        this.start = start;
        this.end = end;
        this.slotType = slotType;
    
    }

    public int getId() {
       
        return id;
    
    }

    public void setId(int id) {
     
        this.id = id;
   
    }

    public String getDate() {
        
        return date;
    
    }

    public void setDate(String date) {
    
        this.date = date;
    
    }

    public String getStart() {
        
        return start;
        
    }

    public void setStart(String start) {
        
        this.start = start;
        
    }

    public String getEnd() {
        
        return end;
        
    }

    public void setEnd(String end) {
        
        this.end = end;
        
    }

    public int getSlotType() {
        
        return slotType;
        
    }

    public void setSlotType(int slotType) {
        
        this.slotType = slotType;
        
    }    
}
