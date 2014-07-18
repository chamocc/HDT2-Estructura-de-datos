/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ed. Chamo
 */
import java.util.*;

public class StackVector <E> implements Stack <E> {
    protected Vector <E> data;
    
    public StackVector()
    //post: construye un nuevo vectro vacio
    {
        data = new Vector<E>();
    }
    
    public void push (E item){
        //post: el valor es agregado al stack
        
        data.add(item);//cambiarlo
    }
    
}
