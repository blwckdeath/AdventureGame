package org.generation.italy.main;

import org.generation.italy.druid.Adventures;
import org.generation.italy.paladin.PAdventure;
import org.generation.italy.thief.Adventure;
import org.generation.italy.warrior.WAdventure;
import org.generation.italy.wizard.MAdventure;

public class Lore {
    public static void startGame(){
        IO.println("Da giorni, la tua compagnia vaga per le desolate Lande Fantasma, un territorio dimenticato persino dagli dèi, dove nebbie innaturali avvolgono sentieri senza meta e antiche rovine custodiscono segreti mai destinati a essere svelati.\n" +
                "\n" +
                "Stremati dal viaggio, scorgete finalmente un'insegna tremolante nella foschia: Il Rutto del Drago. Una locanda, proprio nel cuore di quelle terre maledette. Un rifugio insperato.\n" +
                "\n" +
                "Ignorando i presagi, varcate la soglia. Ma quello che sembra un semplice luogo di ristoro è in realtà il terreno di caccia di Kalojeraw, un malvagio stregone scimmia che da tempo attende nuove prede.\n" +
                "\n" +
                "Con un ghigno, Kalojeraw pronuncia un incantesimo che avvolge l'intera compagnia. La magia scivola su ogni avventuriero, finché non trova una sola anima a cui aggrapparsi.\n" +
                "\n" +
                "La tua.");

    }
    public static int midGame(String pgName, int pgChoice, int lives){
        switch (pgChoice){
            case 1:
                lives = MAdventure.game(pgName, lives);
                break;
            case 2:
                lives = PAdventure.game(lives);
                break;
            case 3:
                lives = Adventure.thief(pgName,lives);
                break;
            case 4:
                lives = Adventures.druid(pgName,lives);
                break;
            case 5:
                lives = WAdventure.warrior(pgName,lives);
                break;
            default:
                IO.println("ERROR");
        }

     return lives;
    }

    public static void endGame(int lives){
    gameSettings.kalojerawAscii();
    int potions = 3;
    int kalojerawLives = 4;
    IO.println("Dopo innumerevoli pericoli e illusioni, raggiungi finalmente un portale che squarcia il velo del tuo incubo. Senza esitare, varchi la soglia.\n" +
            "Dall'altra parte ti attende il responsabile della tua prigionia: Kalojeraw, lo stregone scimmia. Il suo ghigno si allarga nel vederti, convinto che tu sia soltanto l'ennesima anima destinata a perdersi nel suo regno.\n" +
            "Ma il tuo viaggio finisce qui. O forse, finalmente, comincia.\n" +
            "\n" +
            "Estrai le armi. Il tuo incubo ha un volto.\n" +
            "\n" +
            "vite di partenza: " + lives + "\n" +
            "vite di Kalojeraw: " + kalojerawLives + "\n" +
            "numero di pozioni curative: " + potions);

    do{
        int diceNumAtt = gameSettings.diceThrown();
        int kalojerawLives2 = gameSettings.pgAttack(diceNumAtt, kalojerawLives, potions, lives);
        kalojerawLives = kalojerawLives2;
        int diceNumDef = gameSettings.diceThrown();
        int lives2 = gameSettings.pgDefense(diceNumDef, lives);
        lives = lives2;
    }while(kalojerawLives > 0 || lives > 0);
    if(lives == 0){
        IO.println("Lo stregone ti ha annientato definitivamente. GAME OVER!");
    } else{
        IO.println("Il corpo dello stregone si dissolve in un ultimo fremito di magia. Il suo ghigno scompare, e con esso le terre distorte del sogno senza fine.\n" +
                "\n" +
                "Per un istante, tutto tace.\n" + " Poi riapri gli occhi. Sei nella locanda. Il fuoco arde ancora nel camino, i tuoi compagni sono al tuo fianco e sul tavolo giace il boccale che avevi appena portato alle labbra.\n" +
                "È passato soltanto un istante.\n" +
                "Ti alzi lentamente, con il ricordo di un'intera eternità ancora impresso nella mente. I tuoi compagni ti guardano senza comprendere.\n" +
                "Fuori, la strada prosegue.\n" +
                "\n" +
                "L'incubo è finito. Ma Kalojeraw non sarà dimenticato.");
    }

    }


}
