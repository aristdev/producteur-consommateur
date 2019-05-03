/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producteur_consommateur;

/**
 *
 * @author blaesus
 */
public class Producteur implements Runnable{
    String message;
    int numProd;
    BAL boite;
    
    Producteur(BAL boite, int numProd, String message) {
        this.numProd = numProd;
        this.boite = boite;
        this.message = message;
        new Thread(this, "Producteur").start();
    }
    
    public void run(){
        while(true) {
            System.out.println("Thread ["+this.numProd+"]");
            boite.poster(message);
        }
    }
    
}
