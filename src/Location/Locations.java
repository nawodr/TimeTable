/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

/**
 *
 * @author Nawod
 */
public class Locations {
    private int id;
    private String building_Name;
    private String room_Name;
    private String room_Type;
    private int capacity;

    public int getId() {
        return id;
    }

    public String getBuilding_Name() {
        return building_Name;
    }

    public String getRoom_Name() {
        return room_Name;
    }

    public String getRoom_Type() {
        return room_Type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBuilding_Name(String building_Name) {
        this.building_Name = building_Name;
    }

    public void setRoom_Name(String room_Name) {
        this.room_Name = room_Name;
    }

    public void setRoom_Type(String room_Type) {
        this.room_Type = room_Type;
    }

    public void setCapacity(int capasity) {
        this.capacity = capasity;
    }
    
    
}
