
/**
 * Write a description of class PlanDeEstudio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlanDeEstudio
{
    // instance variables - replace the example below with your own
    private ListaGenerica[] plan = new ListaGenerica[5];
    // al tener 5 años como mucho, cada carrera

    /**
     * Constructor for objects of class PlanDeEstudio
     */
    public PlanDeEstudio()
    {
        this.cargarMaterias();
    }

    public void cargarMaterias(){
        int codigo = 1;
        String nombre;
        int ch;
        Materia mat;
        for (int i = 0; i < 5; i++){
            this.plan[i] = new ListaGenerica();
            EntradaSalida.imprimirString("", "Se inicia la carga del año " + i + ". Ingrese un codigo negativo para indicar el fin del mismo.");
            codigo = EntradaSalida.leerInt("Ingrese el codigo de la materia");
            while (codigo > 0){
                nombre = EntradaSalida.leerString("Ingrese el nombre de la materia");
                ch = EntradaSalida.leerInt("Ingrese la carga horaria de " + nombre);
                mat = new Materia(codigo, nombre, ch);
                this.plan[i].addNode(mat);
                codigo = EntradaSalida.leerInt("Ingrese el codigo de la materia");
            }
            EntradaSalida.imprimirString("", "Año " + i + " cargado correctamente.");
        }
        EntradaSalida.imprimirString("", "Plan de estudios cargado correctamente.");
    }
}
