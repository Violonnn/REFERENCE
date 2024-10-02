
package it2e.violon.ots;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IT2EVIOLONOTS {

       public void addCustomer(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("First Name: ");
        String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("Address: ");
        String address = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Contact No: ");
        int no = sc.nextInt();

        String sql = "INSERT INTO tbl_customer (c_fname, c_lname, c_address, c_email, c_no) VALUES (?, ?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname, address, email, no);
    }
       
       private void viewCitizens() {
        config conf = new config();
        String votersQuery = "SELECT * FROM tbl_customer";
        String[] votersHeaders = {"Customer ID", "FName", "LName", "Address", "Email", "Contact"};
        String[] votersColumns = {"c_id", "c_fname", "c_lname", "c_address", "c_email","c_no"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
   
    
    public static void main(String[] args) {
     
        Scanner in = new Scanner (System.in);
        
        System.out.println("[1] ADD ");
        System.out.println("[2] VIEW");
        System.out.println("[3] Update");
        System.out.println("[4] Delete");
        System.out.println("[5] Exit");        
        
        System.out.print("Enter Option: ");
        int opt = in.nextInt();
        IT2EVIOLONOTS ob = new IT2EVIOLONOTS();
        switch(opt){
            
            case 1:     
                ob.addCustomer();                
                break;
            case 2:
                ob.viewCitizens();       
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
                
        }
        
        
    }

 
}
