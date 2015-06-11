
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno extends Persona
{
    // instance variables - replace the example below with your own
    private int numeroAlumno;
    private ListaGenerica matAprobadas = new ListaGenerica();
    private ListaGenerica matCursadas = new ListaGenerica();
    private double notaAcumulada = 0;
    
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(int dni, String nombreApellido, int numeroAlumno){
        super(dni, nombreApellido);
        this.numeroAlumno = numeroAlumno;
    }

    public void agregarMateriaAprobada(Materia mat){
        this.matAprobadas.addNode(mat);
        this.notaAcumulada += EntradaSalida.leerDouble("Ingrese la nota obtenida por " + this.getNombreApellido() + " en " + mat.getNombre());
    }
    
    public void agregarMateriaCursada(Materia mat){
        this.matCursadas.addNode(mat);
    }
    
    public void mostrarAnalitico(){
        String cursadas = "";
        NodoGenerico cur = this.matCursadas.returnFirst();
        while (cur != null){
            Materia mat = (Materia) cur.returnData();
            cursadas += ", " + mat.getNombre();
            cur = cur.getNext();
        }
        String aprobadas = "";
        int cantAprobadas = 0;
        NodoGenerico apr = this.matAprobadas.returnFirst();
        while (apr != null){
            Materia mat = (Materia) apr.returnData();
            aprobadas += " " + mat.getNombre();
            cantAprobadas++;
            apr = apr.getNext();
        }
        double promedio = (double) this.notaAcumulada / cantAprobadas;
        
        // al usuario!
        EntradaSalida.imprimirString("", "Señor " + this.getNombreApellido() + ", a continuación su analítico.");
        EntradaSalida.imprimirString("Cursadas:", cursadas);
        EntradaSalida.imprimirString("Aprobadas:", aprobadas);
        EntradaSalida.imprimirDouble("Su promedio es de", promedio);
    }
}
