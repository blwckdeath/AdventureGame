package org.generation.italy.wizard;
import java.util.Scanner;

public class MAdventure {



        public static Scanner scanner = new Scanner(System.in);
    public static int game (String pgName, int life) {

        Dialogues.introduction(pgName);

        Dialogues.challenge();
        Dialogues.firstChoice();
        int answer;
        do {

            answer = scanner.nextInt();

            if (answer == 2) {

                IO.println("\nTi siedi di nuovo. Afferri il boccale è trangugi il suo contenuto:");
                int roll = DiceResults.Dice();
                DiceResults.firstRoll(roll, life);

                break;
            } else if (answer == 1) {
                IO.println("Preferisci uscire");
                break;
            } else {
                IO.println("Risposta non valida");

            }
        } while (answer != 1 || answer != 2);

        boolean fireBall = false;

        Dialogues.library(pgName);
        scanner.nextLine();
        String riddleAnswer = scanner.nextLine();

        if (riddleAnswer.equals("palla di fuoco")) {
            fireBall = true;

            Dialogues.celebration();
        } else Dialogues.delusion();

        Dialogues.woman();
        Dialogues.goblin();

        if (fireBall) {
            Dialogues.incenerated();
        } else {
            int roll = DiceResults.Dice();
            DiceResults.fight(roll, life);
        }

        Dialogues.end();

        return life;
    }

}




