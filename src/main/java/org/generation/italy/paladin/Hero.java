package org.generation.italy.paladin;

public class Hero {
    public static int lives = 3;

    public static boolean loseLife() {
        lives--;
        if (lives > 0) {
            IO.println("Hai fallito! Hai perso una vita. Vite rimaste: " + lives);
            IO.println("Il cammino si resetta... Ritenti l'avventura!");
            Adventure.paladinJourney();
            return true;

        } else {
            IO.println("=========================================");
            IO.println("!!! GAME OVER DEFINITIVO !!!");
            IO.println("Hai esaurito tutte le tue vite. Lo stregone Kalogerow ha vinto.");
            IO.println("=========================================");
            return false;
        }






    }
}
