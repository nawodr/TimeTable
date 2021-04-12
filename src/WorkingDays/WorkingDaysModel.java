package WorkingDays;

public class WorkingDaysModel {
    
    int id;
    int noOfWorkingDays;
    String workingDays;
    String workingHours;

    public WorkingDaysModel() {
    }

    public WorkingDaysModel(int noOfWorkingDays, String workingDays, String workingHours) {
      
        this.noOfWorkingDays = noOfWorkingDays;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
   
    }

    public WorkingDaysModel(int id, int noOfWorkingDays, String workingDays, String workingHours) {
 
        this.id = id;
        this.noOfWorkingDays = noOfWorkingDays;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
   
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
