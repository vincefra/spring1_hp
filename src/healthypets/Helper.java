/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthypets;

/**
 *
 * @author work
 */
public final class Helper 
{
    //https://stackoverflow.com/questions/7486012/static-classes-in-java
    
    private static int minName = 1;
    private static int maxName = 20;
    
    private Helper(){}
    
    // <editor-fold defaultstate="collapsed" desc=" Metoder ">

    public static boolean tryParseInt(String value) 
    {  
        //try catch, error returnera false och hamnar i nfe exception
        try 
        {  
             Integer.parseInt(value);  
             return true;  
        } 
        catch (NumberFormatException e) 
        {  
            return false;  
        }
    }
    
    public static boolean validName(String value)
    {
        return checkLength(minName, maxName, value) && onlyLetters(value);
    }
    
    public static boolean onlyLetters(String value) 
    {   
        /*
            ^: Field starts with.
            $: Field ends with. 
        */
        
        return value.matches("^[a-öA-Ö]+$");
    }
    
    public static boolean checkLength(int min, int max, String value)
    {
        return value.length() >= min && value.length() <= max;
    }
    
    // </editor-fold>
}
