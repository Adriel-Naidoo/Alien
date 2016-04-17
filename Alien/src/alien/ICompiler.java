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
public interface ICompiler 
{
  /*Adriel Naidoo
    Compiler Logic Representation
    
        These abstract protocols define the programs ability to make sure that the correct syntax is being used.
    */
    
    
    //checks that the syntax for declaring variables is corret
    public String checkDeclareSyntax(String syntax);
    
    //Checks that the syntax for doing operations are correct
    public boolean checkOperationSyntax(String syntax);
    
    //Checks that the syntax for outputing variable contents is correct
    public boolean checkOutputSyntax(String syntax);
    
    //Checks if a variable is already been defined
    public boolean isAlreadyDeclaredSyntax(String syntax);
}
