package Wizard;
import java.util.Random;
public class DiceResults {


    public static int Dice() {
        Random random = new Random();
        IO.println("Lancio di dado");
        int roll = random.nextInt(20) + 1;
        IO.println("Hai fatto: " + roll);
        return roll;
    }
    public static void firstRoll (int roll) {
        if (roll < 10) {
            IO.println("Che idea di merda. Un personaggio del tuo calibro che si abbassa a una cazzatina del genere." +
                    "\nTi senti malissimo.... Perdi un punto vita");

        } else if (roll >= 11 && roll <= 15) {
            IO.println("Fa schifo, ma grazie alla formula magica che hai recitato silenziosamente prima del sorso ti salvi dal vomitare");

        } else {
            IO.println("Come al solito chi osa sottovalutarti viene distrutto." +
                            "\nSul fondo del boccale c'è scritto \"la soluzione dell'indivinello del guerriero ti sarà utile\".\nIn qualche modo" +
                    "Nome.pg" + " capisce che è un messaggio per qualcuno, ma non lui."
            );

        }
    }
}