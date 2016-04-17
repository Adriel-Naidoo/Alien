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
public class TokenLogic 
{
    public Token createToken(char token)
    {
        TokenType type=this.identifyToken(token);
        
        return new Token(token,type);
    }
    
    //Adriel Naidoo - Private method that is used to determine what type of token is being processed
    private TokenType identifyToken(char token)
    {
        int asciiCode=(int)token;
        TokenType type;
        //Adriel Naidoo - First check if the character is numerical
        if(asciiCode > 47 && asciiCode < 58)
        {
            type=TokenType.NUMBER;
        }
        //Adriel Naidoo - Checks if character is Alphabetical
        else if(asciiCode > 64 && asciiCode < 91)
        {
            type=TokenType.VARIABLE;
        }
        else if(token == ' ')
        {
            type=TokenType.SPACE;
        }
        //Adriel Naidoo - Checks if character is an operator
        else
        {
            switch(asciiCode)
            {
                case 42: type=TokenType.MULTIPLICATION;
                break;
                case 43: type=TokenType.ADDITION;
                break;
                case 45: type=TokenType.SUBTRACTION;
                break;
                case 47: type=TokenType.DIVISION;
                break;
                case 60: type=TokenType.LESS_THAN;
                break;
                case 61: type=TokenType.ASSIGN;
                break;
                case 62: type=TokenType.GREATER_THAN;
                break;
                default:type=null;
            }
        }
        
       return type;
    }
}
