/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 * Clase que permite la validacion de datos tomada de un jtf y comprobar que este pueda ser numerico
 * @author manl_
 */
public class DataValidation {
    /**
     * Metodo que permiten el verificar que el valor de un jtf ingresado sea numerico
     * y haga la conversion de valor cadena a un valor doble y de lo contrario envie mensaje de error.
     * @param value valor del jtf que se recibe y sera verificado
     * @return 
     */
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
    
    /**
     * Metodo que permiten el verificar que el valor de un jtf ingresado sea numerico
     * y haga la conversion de valor cadena a un valor flotante y de lo contrario envie mensaje de error.
     * @param value valor del jtf que se recibe y sera verificado
     * @return 
     */
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
    
    /**
     * Metodo que permiten el verificar que el valor de un jtf ingresado sea numerico
     * y haga la conversion de valor cadena a un valor doble y de lo contrario envie mensaje de error.
     * @param value valor del jtf que se recibe y sera verificado
     * @return 
     */
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
