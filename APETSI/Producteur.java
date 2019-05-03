
/**
 * Producteur
 */
import java.util.ArrayList;
import java.util.Random;

public class Producteur implements Runnable {
    Thread th;
    BAL b;
    // 2-Creation de la variable generant le nombre aleatoire
    Random alea = new Random();
    int valAlea;

    Producteur(BAL b) {
        this.b = b;
        th = new Thread(this, "Producteur ");
        th.start();
    }

    /**
     * @return the alea
     */
    public int getValAlea() {
        valAlea = 5 + alea.nextInt(16 - 5);
        return valAlea;
    }

    @Override
    public void run() {

        // liste de messages a produire
        ArrayList<String> listeMessage = new ArrayList<>();
        listeMessage.add("Bonjour ");
        listeMessage.add("tout ");
        listeMessage.add("le ");
        listeMessage.add("monde ");

        do {

            for (int i = 0; i < listeMessage.size(); i++) {

                b.produire(listeMessage.get(i));
                System.out.println("Producteur: " + th.getId());
                // debug de la variable aleatoire
                // System.out.println("val alea = " + getValAlea());

            }
            // #3-Politique de terminaison
            // Si la variable aleatoire depasse 9 il y a fin de production de messages
            if (getValAlea() > 9) {
                System.out.println("-=======fin de production des messages==========-");

                break;
            }

        } while (getValAlea() <= 9);

    }
}