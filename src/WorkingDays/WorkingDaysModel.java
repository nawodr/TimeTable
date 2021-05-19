package WorkingDays;

public class WorkingDaysModel {
    
    int id;
    int noOfWorkingDays;
    String workingDays;
    String workingHours;
    String workingMin;
    
    public String getWorkingMin() {
        return workingMin;
    }

    public void setWorkingMin(String workingMin) {
        this.workingMin = workingMin;
    }
    

    public WorkingDaysModel() {
    }

    public WorkingDaysModel(int noOfWorkingDays, String workingDays, String workingHours, String workingMin) {
      
        this.noOfWorkingDays = noOfWorkingDays;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
        this.workingMin = workingMin;
   
    }

    public WorkingDaysModel(int id, int noOfWorkingDays, String workingDays, String workingHours, String workingMin) {
 
        this.id = id;
        this.noOfWorkingDays = noOfWorkingDays;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
        this.workingMin = workingMin;
    }

    public int getId() {
       
        return id;
    
    }

    public void setId(int id) {
     
        this.id = id;
   
    }

    public int getNoOfWorkingDays() {
     
        return noOfWorkingDays;
    
    }

    public void setNoOfWorkingDays(int noOfWorkingDays) {
  
        this.noOfWorkingDays = noOfWorkingDays;
   
    }

    public String getWorkingDays() {
     
        return workingDays;
   
    }

    public void setWorkingDays(String workingDays) {
     
        this.workingDays = workingDays;
   
    }

    public String getWorkingHours() {
    
        return workingHours;
    
    }

    public void setWorkingHours(String workingHours) {
    
        this.workingHours = workingHours;
    
    }
}
