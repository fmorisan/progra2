
/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente extends Persona
{
    // instance variables - replace the example below with your own
    private String inicioActividades;
    private ListaGenerica materiasDictadas = new ListaGenerica();

    /**
     * Constructor for objects of class Docente
     */
    public Docente(int dni, String nombreApellido, String iniActividades)
    {
        super(dni, nombreApellido);
        this.inicioActividades = iniActividades;
    }
    
    public void agregarMateria(Materia mat){
        this.materiasDictadas.addNode(mat);
    }
}
