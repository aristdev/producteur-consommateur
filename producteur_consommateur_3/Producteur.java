/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producteur_consommateur;

import static java.lang.Math.random;

/**
 *
 * @author blaesus
 */
public class Producteur implements Runnable{
    String message;
    int numProd;
    int msgMax;
    BAL boite;
    Thread t;
    Producteur(BAL boite, int numProd, String message) {
        this.numProd = numProd;
        this.boite = boite;
        this.message = message;
        this.msgMax = (int)(Math.random() * 20);
        this.t = new Thread(this, "Producteur");
        t.start();
    }
    
    public void run(){
        
        for(int i = 0; i < msgMax; i++)
        {
            if(boite.actif){
               System.out.println("Thread ["+this.numProd+"]");
               boite.poster(message); 
            }
        }
        if(boite.actif == true)
        {
            boite.actif = false;
            System.out.println(" le thread ["+this.numProd+"] marque la fin apres ["+this.msgMax+"] messages");
            System.out.println("fin du thread ["+this.numProd+"]");
        }
        else
        {
            System.out.println("fin du thread ["+this.numProd+"]");
        }
    }
    
}
