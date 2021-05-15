package Session;

public class SessionModel {
    
    int id;
    String lecturers;
    String tag;
    String group_id;
    String subgroup_id;
    String sub_code;
    String subject;
    String stu_count;
    String tag_duration;
    
    public SessionModel() {
    }

    public SessionModel(String lecturers, String tag, String group_id, String subgroup_id, String sub_code, String subject, String stu_count, String tag_duration) {
        
        this.lecturers = lecturers;
        this.tag = tag;
        this.group_id = group_id;
        this.subgroup_id = subgroup_id;
        this.sub_code = sub_code;
        this.subject = subject;
        this.stu_count = stu_count;
        this.tag_duration = tag_duration;
    
    }

    public SessionModel(int id, String lecturers, String tag, String group_id, String subgroup_id, String sub_code, String subject, String stu_count, String tag_duration) {
        
        this.id = id;
        this.lecturers = lecturers;
        this.tag = tag;
        this.group_id = group_id;
        this.subgroup_id = subgroup_id;
        this.sub_code = sub_code;
        this.subject = subject;
        this.stu_count = stu_count;
        this.tag_duration = tag_duration;
    
    }

    public int getId() {
    
        return id;
    
    }

    public void setId(int id) {
     
        this.id = id;
    
    }

    public String getLecturers() {
    
        return lecturers;
    
    }

    public void setLecturers(String lecturers) {
     
        this.lecturers = lecturers;
    
    }

    public String getTag() {
     
        return tag;
    
    }

    public void setTag(String tag) {
    
        this.tag = tag;
    
    }

    public String getGroup_id() {
    
        return group_id;
    
    }

    public void setGroup_id(String group_id) {
   
        this.group_id = group_id;
    
    }

    public String getSubgroup_id() {
    
        return subgroup_id;
    
    }

    public void setSubgroup_id(String subgroup_id) {
    
        this.subgroup_id = subgroup_id;
    
    }

    public String getSub_code() {
    
        return sub_code;
    
    }

    public void setSub_code(String sub_code) {
    
        this.sub_code = sub_code;
   
    }

    public String getSubject() {
     
        return subject;
    
    }

    public void setSubject(String subject) {
    
        this.subject = subject;
    
    }

    public String getStu_count() {
     
        return stu_count;
    
    }

    public void setStu_count(String stu_count) {
    
        this.stu_count = stu_count;
   
    }

    public String getTag_duration() {
     
        return tag_duration;
   
    }

    public void setTag_duration(String tag_duration) {
    
        this.tag_duration = tag_duration;
    
    }
}
