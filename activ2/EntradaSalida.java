/**
 * Permite el ingreso y salida por pantalla de datos.
 * Intenta abstraer a los alumnos del uso de ventanas 
 * y/o construcción de datos para imprimir información.
 * 
 * @author (Silvana Gallo) 
 * @version (1.0)
 */

import javax.swing.*;
import java.lang.Exception;

public class EntradaSalida
{
    /**
     * Constructor de objetos de la clase EntradaSalida
     */
    public EntradaSalida()
    {
        // initialise instance variables
    }

    /**
     * Lee un dato de tipo long
     * 
     * @return Valor leido
     */
    public static long leerLong(String descripcion)
    {
        try{
            String str= (String)JOptionPane.showInputDialog(null,descripcion,"Leer", JOptionPane.QUESTION_MESSAGE);
            return Long.parseLong(str);
        }
        catch (Exception e){
            return leerLong("Ingrese un valor válido");
        }
    }
    
    /**
     * Imprime un dato de tipo long
     */
    public static void imprimirLong(String descripcion,long l)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+Long.toString(l));
    }
    
    /**
     * Lee un dato de tipo int
     * 
     * @return Valor leido
     */
    public static int leerInt(String descripcion)
    {
        try{
            String str= (String)JOptionPane.showInputDialog(null,descripcion,"Leer", JOptionPane.QUESTION_MESSAGE);
            return Integer.parseInt(str);
        }
        catch (Exception e){
            return leerInt("Ingrese un valor válido");
        }
    }
    
    /**
     * Imprime un dato de tipo int
     */
    public static void imprimirInt(String descripcion,int i)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+Integer.toString(i));
    }
    
    /**
     * Lee un dato de tipo short
     * 
     * @return Valor leido
     */
    public static short leerShort(String descripcion)
    {
        try{
            String str= (String)JOptionPane.showInputDialog(null,descripcion,"Leer", JOptionPane.QUESTION_MESSAGE);
            return Short.parseShort(str);
        }
        catch (Exception e){
            return leerShort("Ingrese un valor válido");
        }
    }

    /**
     * Imprime un dato de tipo short
     */
    public static void imprimirShort(String descripcion, short s)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+Short.toString(s));
    }
    
    /**
     * Lee un dato de tipo byte
     * 
     * @return Valor leido
     */
    public static byte leerByte(String descripcion)
    {
        try{
            String str= (String)JOptionPane.showInputDialog(null,descripcion,"Leer", JOptionPane.QUESTION_MESSAGE);
            return Byte.parseByte(str);
        }
        catch (Exception e){
            return leerByte("Ingrese un valor válido");
        }
    }
        
    /**
     * Imprime un dato de tipo byte
     */
    public static void imprimirByte(String descripcion, byte b)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+Byte.toString(b));
    }
    
    /**
     * Lee un dato de tipo double
     * 
     * @return Valor leido
     */
    public static double leerDouble(String descripcion)
    {
        try{
            String str= (String)JOptionPane.showInputDialog(null,descripcion,"Leer", JOptionPane.QUESTION_MESSAGE);
            return Double.parseDouble(str);
        }
        catch (Exception e){
            return leerDouble("Ingrese un valor válido");
        }
    }
    
    /**
     * Imprime un dato de tipo double
     */
    public static void imprimirDouble(String descripcion, double d)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+Double.toString(d));
    }
    
    /**
     * Lee un dato de tipo float
     * 
     * @return Valor leido
     */
    public static float leerFloat(String descripcion)
    {
        try{
            String str= (String)JOptionPane.showInputDialog(null,descripcion, "Leer", JOptionPane.QUESTION_MESSAGE);
            return Float.parseFloat(str);
        }
        catch (Exception e){
            return leerFloat("Ingrese un valor válido");
        }
    }
    
    /**
     * Imprime un dato de tipo float
     */
    public static void imprimirFloat(String descripcion, float f)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+Float.toString(f));
    }
    
    /**
     * Lee un dato de tipo String
     * 
     * @return Valor leido
     */
    public static String leerString(String descripcion)
    {
        try{
            return (String)JOptionPane.showInputDialog(null,descripcion,"Leer", JOptionPane.QUESTION_MESSAGE);
        }
        catch (Exception e){
            return leerString("Ingrese un valor válido");
        }
    }
    
    /**
     * Imprime un dato de tipo String
     */
    public static void imprimirString(String descripcion, String s)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+s);
    }
    
    /**
     * Lee un dato de tipo char
     * 
     * @return Valor leido
     */
    public static char leerChar(String descripcion)
    {
       try{
            return ((String)JOptionPane.showInputDialog(null,descripcion,"Leer", JOptionPane.QUESTION_MESSAGE)).charAt(0);
       }
       catch (Exception e){
            return leerChar("Ingrese un valor válido");
       }
    }
    
    /**
     * Imprime un dato de tipo char
     */
    public static void imprimirChar(String descripcion, char c)
    {
        JOptionPane.showMessageDialog(null, descripcion+" "+Character.toString(c));
    }   
}
