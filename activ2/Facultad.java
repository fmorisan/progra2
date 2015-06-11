
/**
 * Write a description of class Facultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facultad
{
    // instance variables - replace the example below with your own
    private ListaGenerica listaAlumnos = new ListaGenerica();
    private ListaGenerica listaCarreras = new ListaGenerica();
    private ListaGenerica listaDocentes = new ListaGenerica();

    /**
     * Constructor for objects of class Facultad
     */
    public Facultad()
    {
    }
    
    public void agregarAlumno(Alumno alu){
        listaAlumnos.addNode(alu);
    }
    
    public void agregarDocente(Docente doc){
        listaDocentes.addNode(doc);
    }
    
    public void agregarCarrera(PlanDeEstudio plan){
        listaCarreras.addNode(plan);
    }
    
    public ListaGenerica[] getListas(){
        ListaGenerica[] l = new ListaGenerica[3];
        l[0] = this.listaAlumnos;
        l[1] = this.listaDocentes;
        l[2] = this.listaCarreras;
        return l;
    }
}