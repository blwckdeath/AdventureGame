package org.generation.italy.paladin;

public class Hero {

    public static boolean loseLife(int lives) {
        lives--;
        if (lives > 0) {
            IO.println("Hai fallito! Hai perso una vita. Vite rimaste: " + lives);
            IO.println("Il cammino si resetta... Ritenti l'avventura!");
            Steps.paladinJourney(lives);
            return true;

        } else {
            IO.println("=========================================");
            IO.println("!!! GAME OVER DEFINITIVO !!!");
            IO.println("Hai esaurito tutte le tue vite. Lo stregone Kalojeraw ha vinto.");
            IO.println("=========================================");
            return false;
        }






    }
}
