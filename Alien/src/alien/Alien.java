/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alien;

/**
 *
 * @author ADRIELICAL
 */
import java.util.*;
import java.io.*;
public class Alien {

    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        
        Scanner kb=new Scanner (System.in);
        
        final String PATH="C:\\Users\\ADRIELICAL\\Desktop\\Alien\\src\\alien\\tokens.txt";
        BufferedReader read=new BufferedReader(new FileReader(PATH));
        
        String temp;
        
        while((temp=read.readLine()) != null)
        {
            char[]tokenized=temp.toCharArray();
            for(char current: tokenized)
            {
              Token x=new TokenLogic().createToken(current);
              if(x.getType()==null)
              {
                  System.out.println("Token Failed: \t" +current +"\t Unable to Identify");
              }
              else
              {
                  System.out.println("Token Passed: \t" +current+ " \tidentified as " +x.getType());
              }
            }
        }
        
        
        
  
    }
    
}
