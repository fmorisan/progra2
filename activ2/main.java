
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
   static Facultad fac;
   static Alumno alu;
   static Docente doc;
   static PlanDeEstudio plan;
   // Personas
   static int dni;
   static int numeroAlumno;
   static String nombreApellido;
   static String iniActividades;
   // Materias
   static String nombre;
   static int codigo;
   static int ch;
   
   public static void main(){
       // Crear una facultad
       Facultad fac = new Facultad();
       // Crear un alumno
       EntradaSalida.imprimirString("", "Ingrese los datos del alumno.");
       dni = EntradaSalida.leerInt("Ingrese DNI");
       nombreApellido = EntradaSalida.leerString("Ingrese Nombre y Apellido");
       numeroAlumno = EntradaSalida.leerInt("Ingrese numero de alumno");
       Alumno alu = new Alumno(dni, nombreApellido, numeroAlumno);
       // Inscribir el alumno a la facultad
       fac.agregarAlumno(alu);
       
       // Crear una materia
       nombre = EntradaSalida.leerString("Ingrese el nombre de la materia");
       codigo = EntradaSalida.leerInt("Ingrese el codigo de la materia");
       ch = EntradaSalida.leerInt("Ingrese la carga horaria de " + nombre);
       Materia mat = new Materia(codigo, nombre, ch);
       // Crear un docente
       EntradaSalida.imprimirString("", "Ingrese los datos del docente.");
       dni = EntradaSalida.leerInt("Ingrese DNI");
       nombreApellido = EntradaSalida.leerString("Ingrese Nombre y Apellido");
       iniActividades = EntradaSalida.leerString("Ingrese fecha de inicio de actividades");
       Docente doc = new Docente(dni, nombreApellido, iniActividades);
       // Agregar la materia al docente
       doc.agregarMateria(mat);
       
       // Agregamos la misma materia al alumno, for testing purposes
       alu.agregarMateriaAprobada(mat);
       
       // Mostrarle su analitico a un alumno
       alu.mostrarAnalitico(); 
   }
}
