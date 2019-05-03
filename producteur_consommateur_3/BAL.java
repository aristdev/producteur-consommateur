/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producteur_consommateur;

import java.util.LinkedList;

/**
 *
 * @author blaesus
 */
public class BAL {
    int n = 0;
    boolean actif = true;
    boolean valeurMise = false;
    LinkedList messages = new LinkedList();
    
    synchronized void poster(String message){
        if(valeurMise == true){
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException Poster");
            }           
        }
        
        this.messages.push(message);

        
        valeurMise = true;
        System.out.println("Msg Posté: " + message);
        notify();
       
    }
    
    synchronized void lire(){
        if(valeurMise == false){
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException inter");
            }
            
        }
        String msg = (String) this.messages.pop();
        valeurMise = false;
        System.out.println("Msg lu : " + msg);
        notify();    
        //return msg;
    }
}
