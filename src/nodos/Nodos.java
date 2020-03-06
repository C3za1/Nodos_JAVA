/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista list=new Lista();
       int opc=0, r;
       do
       {
          try
          {
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.agregar\n"
                   +"2.mostrar\n"
                   +"3.salir","Menu",3));
            
            switch(opc)
            {
                case 1:
                    try
                    {
                        r=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar elemento:","insertado al inicio",3));
                        list.agregarInicio(r);
                    }
                    catch(NumberFormatException n)
                    {
                        JOptionPane.showMessageDialog(null, "error"+n.getMessage());
                    }
                    break;
                    
                case 2:
                          list.mostrarLista();
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "opc incorrecto");
            }
          }
          catch(Exception e)
           {
               JOptionPane.showMessageDialog(null, "error"+e.getMessage());
           }
          
       }
       while(opc!=3);
    }
    
}
