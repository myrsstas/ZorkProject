package zorkproject.Classes.Game.Classes;


import java.util.Date;

/**
 * Η κλαση Time Χρησημοποιητε για να δινει και διχνει πληροφοριες κατα την διαρκεια του παιχνιδιου και στα παιχνιδια οταν
 * σωζονται. Ετσι θα μπορει ο χρηστης να κανει ανακτηση οποιο save θελει και να συνεχισει απο το σημειο του.
 *
 */
// TODO ΥΠΟ ΥΛΟΠΟΙΗΣΗ
public class Time {
    private final Date createdDate = new java.util.Date();
    //ΕΠΙΣΤΡΕΦΕΙ ΤΟΝ ΧΡΟΝΟ ΣΕ ΔΕΥΤΕΡΟΛΕΠΤΑ ΑΠΟ ΤΗΝ ΕΝΑΡΞΗ ΤΟΥ ΠΑΙΧΝΙΔΙΟΥ
    public int getAgeInSeconds() {
        try {
            java.util.Date now = new java.util.Date();
            return (int) ((now.getTime() - this.createdDate.getTime()) / 1000);
        } catch (Exception ex) {
            ex.getMessage();
            return 1;
        }
    }
    ///ΕΠΙΣΤΡΕΦΕΙ ΟΛΕΣ ΤΙΣ ΤΙΜΕΣ ΤΗΣ ΚΛΑΣΗΣ
    public String toString() {
        return Integer.toString(getAgeInSeconds());
    }

}
