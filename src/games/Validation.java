/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

import java.util.regex.*;

/**
 *
 * @author Desi
 */
public class Validation {

    public boolean Username(String username1) {

        Pattern p = Pattern.compile("\\w+{2,30}");

        Matcher m = p.matcher(username1);

        return m.matches();
    }
    
    public boolean Age (String age1){
        
        char [] age = age1.toCharArray(); 

           boolean a = true;
           double age2=0;

           for(int i=0; i<age.length; i++){
               age2 = (age[age.length -1-i]-48)*Math.pow(10,i);
           }

        if(age2<18 || age2>118){
           
            a=false;
            
        }
        
        return a;
         
        
    }
    
    public boolean Email (String email1){
        
       Pattern p = Pattern.compile("\\w+@\\\\w+\\\\.[a-zA-Z]{2,3}$");

        Matcher m = p.matcher(email1);
        
        return m.matches();
    }
    
    
    
    
    
    
    
    
}
