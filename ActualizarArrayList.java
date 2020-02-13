/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earraylistobxectos;

import java.util.ArrayList;
import java.util.Iterator;
import meusmetodos.MeusMetodos;
import meusmetodos.PedirDato;

/**
 *
 * @author jalonsoriveiro
 */
public class ActualizarArrayList{
    
    public Xogador crearXogador(){
       
        Xogador xog = new Xogador(PedirDato.PedirString(),PedirDato.PedirInt());
        
        return xog;            
    }
    
    public void amosar(ArrayList<Xogador>lista){
    
        Iterator it=lista.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
                /*Tamen se pode facer asi
                int valor = (Integer)it.next();
                System.out.println(valor);*/
            }
    
    }
    public void buscarXogador(ArrayList<Xogador>lista){
    
        Xogador get;
        get = lista.get(5);
            System.out.println(get);
            
            
    
    }
}
