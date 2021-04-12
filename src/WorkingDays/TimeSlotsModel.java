package WorkingDays;

public class TimeSlotsModel {
    
    int id;
    String start;
    String end;
    int slotType;
    
    public TimeSlotsModel() {
    }

    public TimeSlotsModel(String start, String end, int slotType) {
      
        this.start = start;
        this.end = end;
        this.slotType = slotType;
    
    }

    public TimeSlotsModel(int id, String start, String end, int slotType) {
    
        this.id = id;
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
