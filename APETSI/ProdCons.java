/**
 * ProdCons
 */
public class ProdCons {

    public static void main(String[] args) {
        BAL b = new BAL();

        // #1-sans la boucle while(Un seul producteur et un seul consommateur)
        // #2-la boucle while pour la creation de plusieurs consommateurs et producteurs

        while (true) {
            new Producteur(b);
            new Consommateur(b);
        }

    }
}