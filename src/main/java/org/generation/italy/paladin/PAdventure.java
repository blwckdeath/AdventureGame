package org.generation.italy.paladin;
import java.util.Scanner;

//Introduzione al personaggio
public class PAdventure {


    public static int game(int lives) {
        int lives2;
        do {

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
