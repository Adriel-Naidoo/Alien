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
public class Token 
{
    //Declare instance variables for token
    private TokenType TYPE;
    private char tokenId;
  
   public Token()
   {
       
   }
    public Token(char tokenId,TokenType TYPE)
    {
        this.tokenId=tokenId;
        this.TYPE=TYPE;
    }
    
     //Returns the token objects type
    public TokenType getType()
    {
        return this.TYPE;
    }
    
    public char getId()
    {
        return this.tokenId;
    }
}
