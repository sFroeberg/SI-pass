/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si.pass;

/**
 *
 * @author froeb
 */
public class User {
    protected String firstName, lastName;
    protected Designation designation;
    
    public User(String firstName, String lastName, Designation designation){
       this.firstName = firstName;
       this.lastName = lastName;
       this.designation = designation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }
    
}
