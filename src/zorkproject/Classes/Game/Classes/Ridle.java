package zorkproject.Classes.Game.Classes;

/**
 * Κλαση ridle (γριφος) ειναι μια κλαση οπου θα μπορουμε να διαχειριστουμε τους διαφορους γρυφους προς επιλυση. Περα
 * του γεγονοτος οτι θα μπορουμε να προσθεσουμε / αφαιρεσουμε διαφορους γρυφους , οπου θα χρησημοποιουνται απο τα διαφορα item
 * και τους character, θα γινεται και (προς το παρων οχι) προσπαθεια επιλυσης αυτων με ερωτηση- απαντηση. Σε περιπτωση σωστης
 * απαντησης θα απενεργοποιηται μεσω ενος flag για να μην επαναχρησημοποιηθει απο το σεναριο.
 *
 */
public class Ridle {
    private String ridleQuestion;
    private String ridleAnswer;
    private Ridle() {
        ridleQuestion = "";
        ridleAnswer = "";
    }
    Ridle(String question, String answer){
        ridleAnswer = answer;
        ridleQuestion = question;
    }
    public String getRidleQuestion() {
        return ridleQuestion;
    }

    public String getRidleAnswer() {
        return ridleAnswer;
    }
    public Ridle getRidle () {
        Ridle temp = new Ridle();
        temp.ridleQuestion = ridleQuestion;
        temp.ridleAnswer = ridleAnswer;
        return temp;
        // TODO Να διορθωθει η επιστροφη γριφου με κλαση
        /*  ERROR: JDWP Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2
        *   JDWP exit error AGENT_ERROR_NO_JNI_ENV(183):  [util.c:840]
        *
        * */
    }
}
