/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author manl_
 */
public class DataValidation {
    public int string2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
        }
        catch(NumberFormatException num){
            JOptionPane.showMessageDialog(null, "Error de conversión de valor");
            result = 0;
            }
        return result;
    }
    
    public float string2Float(String value){
        float result = 0;
        try{
            result = Float.parseFloat(value);
        }
        catch(NumberFormatException num){
            JOptionPane.showMessageDialog(null, "Error de conversión de valor");
            result = 0;
        }
        return result;
    }   
    
    public double string2Double(String value){
        double result = 0;
        try{
            result = Double.parseDouble(value);
        }
        catch(NumberFormatException num){
            JOptionPane.showMessageDialog(null, "Error de conversión de valor");
            result = 0;
        }
        return result;
    }   
}
