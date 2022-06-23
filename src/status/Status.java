/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    int size = 4;
    int counter =0;
    
    StausUser[] user = new StausUser[size];
    Scanner in =new Scanner(System.in);
    System.out.println("Here is a list of all the status using ENUMs: ");
    
    for (StausUser.Status s :  StausUser.Status.values() )
    {
         user[counter] = new StausUser(s);
         counter++;
    }
    
    for (StausUser ss: user)
    {
        System.out.println(ss.getStatus() );
    }
    
    
    }
    
}
