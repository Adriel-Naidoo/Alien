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
public class CompilerPlugin implements ICompiler 
{

    @Override
    public String checkDeclareSyntax(String syntax)
    {
      
        String msg="NULL";
        
        if(syntax.length()==10)
        {
            if(syntax.contains("DECLARE->"))
            {
                msg="Variable declare compiled successfully";
            }
            else
            {
                msg="Variable syntax is broken. Use declare keyword";
            }
        }
        else
        {
            msg="routine character count is not equal to the count specified by the syntax rule";
        }
        
        return msg;
    }

    @Override
    public boolean checkOperationSyntax(String syntax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkOutputSyntax(String syntax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAlreadyDeclaredSyntax(String syntax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
