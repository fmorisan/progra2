
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private int dni;
    private String nombreApellido;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(int dni, String nombreApellido)
    {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
    }

    public int getDni(){
        return this.dni;
    }
    
    public String getNombreApellido(){
        return this.nombreApellido;
    }
}
