/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si.pass;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class BugManager {
    private int bugID;
    ArrayList<Bugs> bugList = new ArrayList();

    public static void main(String[] args){
        generateBugId();
    }

    public static void deleteBug(int index){
        
    }
    public static void editBug(int index, Bugs bugs){

    }
    public static int generateBugId(){
        int bugID = (int)(Math.random()+1*10);
        System.out.println(bugID);
        return bugID;
    }
    //public static String[] getAllBugs(){
        
    //}
    public static void saveBug(Bugs bugs){
        
    }
}