package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Messaggio di benvenuto;
        //Inserire il nome del personaggio
        //Inserire il nome della compagnia
        //Selezionare la classe del personaggio, che a seconda della scelta nella storia avrà un percorso diverso
        // Ognuno di noi fa le classi
        // Ognuno di noi crea un metodo stampa del personaggio, decidiamo un numero di println
        // Inizio partita
        // Finale comune
        //A fine gioco, puoi decidere di svolgere un'altra avventura con un altro personaggio
        // Diamo 3 vite al personaggio e 3 vite al boss di fine dungeon
        //3 scelte, 2 strade, ex. Andare a sinistra o destra o parla con l'npc che ti pone un indovinello, se indovini ti da la via giusta
        //Altre volte è scriptato, altre volte hai 1, 2 o 3 scelte
        //4 step
        // Se fai le scelte corrette guadagni una vita
        //In base al tipo di classe struttura la lore a modo suo
        // Si lancia un d20, per determinare l'attacco del personaggio e l'attacco del boss
        // Combattimento a turni
        //Da 1 a 4 mancato, da 5 a 9 stordisci e puoi riattaccarlo, da 10 a 19 gli togli una vita, 20 one shot
        // Scelta delle statistiche
        // conversazione con npc che ti da qualche consiglio
        // la storia è un sogno generato dal mago scimmia
        //
        //menu();
        //stats();
        //startGame();
        //endGame();
        int answer = 0;
        Menu.menu();
        if(answer ==2){
            IO.println("Gioco Terminato.");
            return;
        } else {
            String pgName = gameSettings.pgName();
            String fellowshipName = gameSettings.fellowshipName();
            int pgChoice = gameSettings.pgChoice(pgName);
            Lore.startGame(fellowshipName);

            }

            gameSettings.diceThrown();
            int attackLuck = gameSettings.diceThrown();
            IO.println(attackLuck);
    }
}
