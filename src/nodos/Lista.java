/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

/**
 *
 * @author cesar
 */
public class Lista {
    //punteros
    protected Nodo inicio, fin;
    public Lista()
    {
        inicio=null;
        fin=null;
    }
    public void agregarInicio(int elemento)
    {
        inicio=new Nodo(elemento, inicio);
        if(fin==null)
        {
            fin=inicio;
        }
    }
    
    //metodo para mostrar datos
     public void mostrarLista()
     {
         Nodo recorrer=inicio;
         while(recorrer!=null)
         {
             System.out.println("["+recorrer.dato+"]-->");
             recorrer=recorrer.siguiente;
         }
     }
}
