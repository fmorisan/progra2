
/**
 * Write a description of class NodoGenerico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoGenerico
{
    // instance variables - replace the example below with your own
    private Object data;
    private NodoGenerico next;

    /**
     * Constructor for objects of class NodoGenerico
     */
    public NodoGenerico(Object data, NodoGenerico next)
    {
        this.data = data;
        this.next = next;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Object returnData()
    {
        return this.data;
    }
    
    public NodoGenerico getNext(){
        return this.next;
    }
    
    public void setNext(NodoGenerico next){
        this.next = next;
    }
}
