package org.generation.italy.paladin;
import  org.generation.italy.paladin.Picture;
import java.util.Scanner;

//Introduzione al personaggio
public class Adventure {
   public static Scanner scanner = new Scanner(System.in);
    public static void paladinJourney() {
        IO.println("Congratulazioni! Sei il Paladino, che la fede sia con te!");
        IO.println("Sei catapultato nella chiesa di OH, dove tutti sono abbastanza sorpresi. ");
        IO.println("All'esterno della chiesa si aprono tre strade quale scegli?");
        IO.println("1. Le catacombe dei ricordi annebbiati");
        IO.println("2. Il Pantheon Immacolato");
        IO.println("3. La Casa di un'anziana signora");

        IO.println("Inserisci il numero della tua scelta: ");
    }
    public static int game() {
        int lives = 3;
        int lives2;
        do {
            int choice = scanner.nextInt();
            if (choice == 1) {
                Steps.catacombRoute(lives);
            } else if (choice == 2) {
                Steps.pantheonRoute(lives);
            } else if (choice == 3) {
                Steps.grannyRoute(lives);
            }
            lives2 = Steps.catacombRoute(lives);
            if (lives2 < lives) {
                lives = lives2;
                continue;
            }
            lives2 = Steps.altareRoute(lives);
            if (lives2 < lives) {
                lives = lives2;
                continue;
            }
            lives2 = Steps.pantheonRoute(lives);
            if (lives2 < lives) {
                lives = lives2;
                continue;
            }
            lives2 = Steps.grannyRoute(lives);
            if (lives2 < lives) {
                lives = lives2;
                continue;
            }
            lives2 = Steps.reverseWorldRoute(lives);
            if (lives2 < lives) {
                lives = lives2;
                continue;
            }
            lives2 = Steps.finalRoom(lives);
            if (lives2 < lives) {
                lives = lives2;
                continue;
            }

        } while (lives2 < lives);
        return lives;
    }
}
