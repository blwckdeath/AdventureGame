package org.generation.italy.thief;

import java.util.Random;
import java.util.Scanner;

public class Steps {
    public static Scanner input = new Scanner(System.in);;
    public static int i = 6;
    public static Retard retard = new Retard();
    public static boolean oneShot = false;

    public static int thiefPath(String pgName, int lifes) {
        //Introduzione al ladro, risveglio in una città di aristocratici ricchi
        // Si ritrova davanti 3 strade, a destra è un vicolo cieco e perde una vita, a sinistra trova un oggetto e prosegue, al centro prosegue e basta
        String introuction = "Ti risvegli in un vicolo buio di una capitale di aristocratici, ti ritrovi davanti 3 strade, vai a sinistra (1), destra (2) o al centro (3)?";
        IO.println(introuction);


        int choice1 = 0;
        do {
            choice1 = input.nextInt();
            if (choice1 == 1) {
                Retard.retardDialogue();
                IO.println("Scegli di andare a sinistra, trovi un amuleto d'oro, guadagni una vita e prosegui");
                lifes++;

            } else if (choice1 == 2) {
                Retard.retardDialogue();
                IO.println("Ti ritrovi in un vicolo cieco, in cui vieni accoltellato, perdi una vita");
                lifes--;
            } else {
                Retard.retardDialogue();
                IO.println("Prosegui per una via dritta, non trovi nulla ma vai avanti");

            }
        } while (choice1 < 1 || choice1 > 3);
        IO.println("Vite rimaste:" + lifes);
        return lifes;



    }

    //Andato avanti incontra l'npc a cui al giocatore viene posta una scelta, se decide di rubare quindi cedere alla tentazione perde una vita, non gli viene data alcuna dritta, se decide di non cedere, gli viene data l'indicazione per il boss
    public static int thiefPath2(String pgName, int lifes) {
        Sprite.spriteAristocratic();
        String npc = "Incontri un uomo con uno scrigno pieno d'oro, che fai?";
        Retard.retardDialogue();
        IO.println(npc);
        IO.println("1. Lo derubi");
        IO.println("2. Ci parli");
        IO.println("3. Lo ignori");
        int choice = 0;
        do {
            choice = input.nextInt();
            if (choice == 1) {
                Retard.retardDialogue();
                IO.println("Accoltelli l'aristocratico e lo derubi di tutto il suo oro, ma esso era maledetto, l'aristocratico con le sue ultime parole dice: \n" + Dialogues.dialogue1);
                lifes--;
            } else if (choice == 2) {
                Retard.retardDialogue();
                IO.println("L'aristocratico ti dice:");
                IO.println(Dialogues.dialouge2 + pgName + Dialogues.dialogue3);
                oneShot = true; //O oneshotto o non oneshotto
                lifes = lifes + i;
            } else {
                Retard.retardDialogue();
                IO.println("Non sai dove andare, inizi a vagare ovunque e ti accorgi che ti mancano le forze, perdi una vita, però un castello in lontananza attira la tua attenzione, ti dirigi verso di esso");
                lifes--;

            }
        } while (choice < 1 || choice > 3);
        IO.println("Vite rimaste: " + lifes);
        return lifes;

    }

    // Stanza scriptata che porta al boss
    //Boss fight
    public static int thiefPath3(String pgName, int lifes) {
        IO.println("Ti ritrovi davanti alle porte di un castello, a sbarrarti strada c'è un guerriero scimmia, Franco, ti attacca, che fai?");
        Random phrases = new Random();
        Retard.retardDialogue();
        Retard.retardDialogue();
        Sprite.spriteFranco();
        int lifeFranco = 10;
        IO.println("---Franco---\n" +
                "HP = " + lifeFranco);
        int choice = 0;
        if (lifes >= 6) {
            oneShot = true;
            lifes= lifes - i;
        }
        do {
            Retard.retardDialogue();
            int francoInteraction = phrases.nextInt(Dialogues.francoPhrases.length);
            IO.println(Dialogues.francoPhrases[francoInteraction]);
            IO.println("1. Schivi \n" +
                    "2. Attacchi");
            if (oneShot) {
                IO.println("3. Usi il coltello");
                francoInteraction = phrases.nextInt(Dialogues.francoPhrases.length);
                ;

            }
            choice = input.nextInt();
            if (choice == 1) {
                IO.println("Schivi il suo attacco");
            } else if (choice == 2) {
                IO.println("Gli infliggi 4 danni");
                lifeFranco = lifeFranco - 4;
                IO.println("Vita di Franco: " + lifeFranco);
                Retard.retardDialogue();
                if (lifeFranco <= 0) {
                    IO.println("---Franco---\n" +
                            "<<UH UH UHHHHHHHHH (NOOOOOOOOOOOOOOOOOOOOOOOO");
                }


            } else if (choice == 3 && oneShot) {
                IO.println("Infliggi 10 danni a Franco, cade a terra esalando il suo ultimo respiro..il coltello si rompe");
                lifeFranco = lifeFranco - 10;
                IO.println("Vita di Franco: " + lifeFranco);
                IO.println(Dialogues.francoPhrases[2]);
                IO.println("<<UH UH UHHHHHHHHH (NOOOOOOOOOOOOOOOOOOOOOOOO)");
            } else {
                IO.println("Scelta non valida");
            }
        } while (lifes > 0 && lifeFranco > 0);


        return lifes;
    }
}
