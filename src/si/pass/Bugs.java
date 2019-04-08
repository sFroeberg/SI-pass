/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si.pass;

import java.util.ArrayList;

/**
 *
 * @author froeb
 */
public class Bugs {
    private int bugID;
    private String description, steps, status, name;
    private Severity severity;
    private Priority priority;
    
    private ArrayList<String> comments = new ArrayList<>();
    
    public static void main (String []args){
        
        User testUser = new User("Sebastian", "Fröberg", Designation.TESTER);
        Bugs testBug = new Bugs("Title", Priority.HIGH, Severity.MEDIUM, Status.ACTIVE, testUser);
        
        System.out.println("You fix this bug: " + testUser.getFirstName());
        System.out.println("Priority of the bug: " + testBug.getPriority());
        System.out.println("Severity of the bug: " + testBug.severity);
        testBug.setComments("Found today");
        testBug.setComments("Tested today");
        testBug.setComments("Fixed today");
        System.out.println("Comments on bug: " + testBug.getComments());
    }
    
    public Bugs(String name, Priority priority, Severity severity, Status status, User user){
        this.priority = priority;
        this.severity = severity;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(String comment) {
        comments.add(comment);
    }

    public int getID() {
        return this.bugID;
    }

    public void setID(int ID) {
        this.bugID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
