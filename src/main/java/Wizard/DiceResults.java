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

    public static int firstRoll(int roll, int life) {
        if (roll < 10) {
            IO.println("\nChe idea di merda. Un personaggio del tuo calibro che si abbassa a una cazzatina del genere." +
                    "\nTi senti malissimo.... \n-Perdi 1 punto vita-");
            life--;

        } else if (roll >= 11 && roll <= 15) {
            IO.println("\nFa schifo, ma grazie alla formula magica che hai recitato silenziosamente prima del sorso ti salvi dal vomitare");

        } else {
            IO.println("\nCome al solito chi osa sottovalutarti viene distrutto." +
                    "\nSul fondo del boccale c'è scritto \"la soluzione dell'indivinello del guerriero ti sarà utile\"\nIn qualche modo" +
                    "Nome.pg" + " capisce che è un messaggio per qualcuno, ma non lui."
            );

        }
        return life;
    }

    public static int fight(int roll, int life) {
        if (roll==1) {
            IO.println("Quei bastardi sono velocissimi. Prima che tu possa muovere un muscolo ti hanno già tagliato." +
                    "\n-Prendi 2 punto vita-");
            life = life-2;
        }else if (roll>=2 && roll<=8) {
            IO.println("Prima che tu riesca a sconfiggere anche l'ultimo di quei bastardi questo riesce a fenderti con il pugnale." +
                    "\n-Perdi 1 punto vita-");
        }else if (roll>=9 && roll<=14) {
            IO.println("Nel combattimento uno di quei bastardi ti è riuscito a ferire," +
                    "\nma fortunatamente un suo compagno trasportava una pozione di cura e questa basta per guarirti");
        }else {
            IO.println("Sei un fulmene, prima che nessuno dei tre abbia il tempo di reagire un missile magico l'ha trafitto mortalmente." +
                "\nScopri che uno di loro stava trasportando una pozione di cura." +
                "\n-Guadagni 1 punto vita-");
            life++;
        }
        return life;
    }
}