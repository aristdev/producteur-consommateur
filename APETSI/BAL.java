
/**
 * BAL
 */
public class BAL {

    String message;
    boolean messageEnvoye = false;

    synchronized void produire(String message) {
        if (messageEnvoye == true)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrompu");
            }
        this.message = message;
        messageEnvoye = true;
        System.out.println("Message envoye : " + message);
        notify();
    }

    synchronized String consommer() {
        if (messageEnvoye == false)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrompu");
            }
        System.out.println("Message recu: " + message);
        messageEnvoye = false;
        notify();
        return message;
    }
}