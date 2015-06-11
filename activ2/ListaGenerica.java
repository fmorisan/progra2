
/**
 * Write a description of class ListaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaGenerica
{
    // instance variables - replace the example below with your own
    private NodoGenerico first;

    /**
     * Constructor for objects of class ListaGenerica
     */
    public ListaGenerica()
    {
        // initialise instance variables
        this.first = null;
    }

    public void addNode(Object data){
        NodoGenerico tmp = this.first;
        this.first = new NodoGenerico(data, null);
        this.first.setNext(tmp);
    }
    
    public NodoGenerico returnFirst(){
        return this.first;
    }
   
    public int len(){
        int i = 0;
        NodoGenerico node = this.first;
        while (node != null){
            i++;
            node = node.getNext();
        }
        return i;
    }
    
    public Object[] returnContentsAsArray(){
        int len = this.len();
        Object[] list = new Object[len];
        NodoGenerico node = this.first;
        
        int i = 0;
        while (node != null){
            list[i] = node.returnData();
            i++;
        }
        return list;
    }
}
