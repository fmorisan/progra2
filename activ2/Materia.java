
/**
 * Write a description of class Materia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Materia extends Object
{
    // instance variables - replace the example below with your own
    private int codigo;
    private String nombre;
    private int cargaHoraria;

    /**
     * Constructor for objects of class Materia
     */
    public Materia(int codigo, String nombre, int cargaHoraria)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
}
