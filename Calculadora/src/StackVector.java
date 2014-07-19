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
    protected Vector<E> data;
    private int index=0;
    
    public StackVector()
    //post: construye un nuevo stack vacio
    {
        data=new Vector<E>();
    }
    
    @Override
    public void push(E item) {
        //pre:
        //post: se agrga un elemento al stack
        data.add(index,item);
        index++;
    }

    @Override
    public E pop() {
        //post: hay algo en el stack
        //pre: se extrae el primer elemento del stack
        if (data.isEmpty() ==true)
        {
            return null;
        }
        else {     
        E elemento;
        index--;
        elemento = data.elementAt(index);
        data.removeElementAt(index);
        return elemento;
        }
    }

    @Override
    public E peek() {
        //pre:
        //post:
        return data.elementAt(index);   
    }

    @Override
    public boolean empty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
