/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earraylistobxectos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
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
    
       String nombre = JOptionPane.showInputDialog("Dame Nombre");
        for (Xogador x : lista) {
            if (nombre.equals(x.nome)) {
                System.out.println("El jugador " + nombre + " Tiene el dorsal: " + x.dorsal);
            }
        }
            
            
    
    }
    
    public void darDeBaja(ArrayList<Xogador> lista) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dorsal jugador"));
        for (int i = 0; i < lista.size(); i++) {
            if (num == lista.get(i).dorsal) {
                lista.remove(lista.get(i));
            }
        }
    }
    public void ordenar(ArrayList<Xogador> lista) {
        Collections.sort(lista);
        
    }
       public void salir() {
        System.exit(0);
    }
}
