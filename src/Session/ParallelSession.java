/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

/**
 *
 * @author Administrator
 */
public class ParallelSession {
    
    private int id;
    private String yNs;
    private String session;
    private String sessionID;
    
    public ParallelSession(){}

    public ParallelSession(int id, String yNs, String session, String sessionID) {
        this.id = id;
        this.yNs = yNs;
        this.session = session;
        this.sessionID = sessionID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getyNs() {
        return yNs;
    }

    public void setyNs(String yNs) {
        this.yNs = yNs;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    
}
