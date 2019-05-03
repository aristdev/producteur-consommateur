package producteur_consommateur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blaesus
 */
public class prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BAL boite = new BAL();
        new Producteur(boite, 1, "message_1");
        new Consommateur(boite, 2);
        System.out.println("Ctrl-C pour arreter.");
    }
    
}
