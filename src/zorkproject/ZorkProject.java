package zorkproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import zorkproject.Classes.Game.Classes.*;
import zorkproject.Classes.Game.Classes.Function.Functions;

import java.util.*;


public class ZorkProject/* extends Application*/{
    //TODO Μελλοντικη χρηση γραφικου περιβαλλοντος
//    @Override
//    public void start(Stage stage) throws Exception {
//        int i= 0;
//        Parent root = FXMLLoader.load(getClass().getResource("../zorkproject/Classes/Game/UI/UI.fxml"));
//        stage.setTitle("ZorkProject - Οι περιπετειες του Αιαντα");
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        //launch(args);
        String inputCommand;
        Functions functions = new Functions(10,20);
        Game game = new Game();
        Command command = new Command();
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();
        Item item = new Item();
        Message message = new Message();
        HashMap<String, Functions> functionsHashMap = new HashMap<String,Functions>();
        //TODO ΠΡΟΣΩΡΙΝΗ ΔΗΛΩΣΗ ΕΔΩ ΛΟΓΩ ΠΡΟΒΛΗΜΑΤΟΣ ΜΕ ΤΑ ΤΧΤ ΑΡΧΕΙΑ
//        Object aNew;
//        functionsHashMap.put("new",new Functions());
//        functionsHashMap.put("exit",new Functions());
//        Set keys = functionsHashMap.keySet();

        System.out.println(message.getWelcomeMessage());
        inputCommand= scanner.next().trim().toLowerCase();
        while (true) {
            switch (inputCommand) {
                case "new": functions.newGame();

                    break;
                case "load"://Υπο υλοποιηση
                    break;
                case "save": //Υπο υλοποιηση
                    break;
                case "time": System.out.println(time.toString());
                    break;
                case "exit": functions.exitGame();
                    break;
                default:
                    System.out.println(functions.invalidCommand());
                    break;
            }

            inputCommand= scanner.next().trim().toLowerCase();

            //TODO Hashmaps και συναρτησεις κλασεων δεν εγιναν κατανοητες. Μελλοντικη διορθωση
//            functionsHashMap.get(inputCommand);
//            System.out.printf("%s",functionsHashMap.get(inputCommand));
//            for (Iterator i = keys.iterator(); i.hasNext(); ) {
//                    String key = (String) i.next();
//                    Functions value = functionsHashMap.get(key);
//                    System.out.printf(key + " = " + value + "\n");
//
//                //    System.out.println("Η εντολη Συστηματος ΔΕΝ ΥΠΑΡΧΕΙ");
//            }

            //TODO FILE STREAMS για να γινει ανακτηση των αντικειμενων απο εκει.
//            message.openFileWrite();
//            message.writeRecords();
//            message.closeFileWrite();
//            message.openFileRead();
//            message.readRecords();
//            message.closeFileRead();
        }
       // launch(args);
    }
}