/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earraylistobxectos;

import java.util.ArrayList;

/**
 *
 * @author jalonsoriveiro
 */
public class EArrayListObxectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Xogador>listaXogadores = new ArrayList();
        
      
        
        ActualizarArrayList obx = new ActualizarArrayList();
        
        
       for(int i=0;i<5;i++){
          listaXogadores.add(obx.crearXogador());
          }
        obx.amosar(listaXogadores);
         System.out.println("asdasdasd");
        obx.buscarXogador(listaXogadores);

    }
    
}
