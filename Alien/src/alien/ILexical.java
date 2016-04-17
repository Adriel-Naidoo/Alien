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
public interface ILexical 
{
    /*Adriel Naidoo
     Operator Logic Representation
    
        These abstract protocols define the programs lexical operations
    */
    
    //Adriel Naidoo - Performs an addition operation
    public Token addition(Token x, Token y);
    
    //Adriel Naidoo - Performs a subtraction operation
    public Token subtraction(Token x, Token y);
    
    //Adriel Naidoo - Performs a multiplications
    public Token multiplication(Token x, Token y);
    
    //Adriel Naidoo - Performs a division operation
    public Token division(Token x, Token y);
    
    //Adriel Naidoo - Assigns a value to another variable
    public Token assign(Token x, Token y);
    
    //Adriel Naidoo - Used to declare a variable
    public Token declare(char id);
}
