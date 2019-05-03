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
public class Consommateur implements Runnable{
    int numProd;
    BAL boite;

    Consommateur(BAL boite, int numProd){
        this.numProd = numProd;
        this.boite = boite;
        new Thread(this, "Producteur").start();
    }
    
    public void run(){
        while(true){
           System.out.println("Thread ["+this.numProd+"]");
           boite.lire();
           
        }
    }
    
}
