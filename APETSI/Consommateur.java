
/**
 * Consommateur
 */

public class Consommateur implements Runnable {

    BAL b;
    Thread th;

    Consommateur(BAL b) {
        this.b = b;
        th = new Thread(this, "Consommateur ");
        System.out.println("Consommateur: " + th.getId());
        th.start();
    }

    @Override
    public void run() {
        while (true) {
            b.consommer();

        }

    }
}