package org.generation.italy.warrior;

import com.generation.library.Console;

public class Steps {
    public static int stepOne(String warriorName, int hearts) {
        Console.print(warriorName + ", ti trovi davanti alle Rovine del Tempio Spezzato. Come vuoi entrare?");
        Console.print("1) Abbattere la porta principale a spallate");
        Console.print("2) Cercare un passaggio secondario tra le edere sui muri");
        Console.print("3) Guardare nel pozzo asciutto nel cortile");
        Console.print("");
        int choice;
        do {
            IO.print("Scegli: ");
            choice = Console.readInt();
            if(choice != 1 && choice != 2 && choice != 3){
                Console.print("Cosa hai fumato? Devi scegliere 1, 2 o 3!");
            }
        }while(choice != 1 && choice != 2 && choice != 3);

        switch(choice){
            case 1:
                Console.print("Cerchi di abbattere la porta principale a spallate...");
                Console.print("");
                Console.print("Fai troppo rumore! Crolla del pietrisco e scatti per evitarlo.");
                Console.print("");
                hearts--;
                Console.print("Hai perso 1 cuore, ma sei riuscito ad entrare.");
                Console.print("Cuori Rimanenti: " + hearts);
                break;
            case 2:
                Console.print("Cerchi di trovare un passaggio secondario tra le edere...");
                Console.print("");
                Console.print("Bravo!! Trovi una crepa nascosta ed entri silenziosamente senza rischi");
                break;
            case 3:
                Console.print("Guardi in un pozzo asciutto lì vicino...");
                Console.print("");
                Console.print("Ti sporgi troppo, il bordo cede e scivoli giù nel fango");
                Console.print("");
                hearts--;
                Console.print("Perdi un cuore, ma riesci a risalire il pozzo e trovare una piccolo spiraglio per entrare");
                Console.print("Cuori Rimanenti: " + hearts);
                break;
        }
        Console.print("");
        return hearts;
    }

    //STEP 2 PRIMA PARTE: indovinello dello stregone
    private static void wizardRiddle(String warriorName){
        Console.print("Entri in una sala affrescata del tempio e al centro noti che c'è lo spirito di uno spettrale Custode");
        Console.print("");
        Console.print("Custode: 'Benvenuto " + warriorName + "! Se risponderai al mio indovinello, ti svelerò la via sicura!'");
        Console.print("");
        Console.print("Vuoi:");
        Console.print("1) Risolvere l'indovinello");
        Console.print("2) Scegliere tu la via");
        Console.print("");
        int choice;
        do {
            IO.print("Scegli: ");
            choice = Console.readInt();
            if (choice != 1 && choice != 2) {
                Console.print("Rincoglionito! Devi scegliere 1 o 2!");
            }
        } while (choice != 1 && choice != 2);
        if (choice == 1) {
            Console.print(warriorName + ": Custode, datemi il vostro indovinello e proverò con tutta la mia astuzia a risolverlo.");
            Console.print("");
            Console.print("Custode: Ottimo...");
            Console.print("'Non ho voce, ma posso raccontare storie. Non ho polmoni, ma se mi bagni muoio. Nutrimi e vivrò, dammi da bere e morirò.");
            Console.print("");
            IO.print("Cosa sono? ");
            String answer = Console.readString().toLowerCase();
            if (answer.equals("il fuoco") || answer.equals("fuoco")) {
                Console.print("Custode: 'Risposta corretta, " + warriorName + "! Ascolta: il corridoio buio ti salverà!'");
            } else {
                Console.print("Custode: 'Errato! Dovrai fidarti solo della tua sorte...'");
            }
        }
        Console.print("");
        Console.print("Lo spirito scompare nel nulla con una grassa risata!");
    }

    //STEP 2 SECONDA PARTE: Scelta del corridoio
    public static int stepTwo(String warriorName, int hearts){
        wizardRiddle(warriorName);
        Console.print("Prosegui e ti trovi davanti a un bivio:");
        Console.print("1) Corridoio illuminato dalle torce");
        Console.print("2) Corridoio buio e silenzioso");
        Console.print("");
        int choice;
        do {
            System.out.print("Scegli: ");
            choice = Console.readInt();
            if (choice != 1 && choice != 2) {
                Console.print("Incapace! Devi scegliere tra 1 e 2.");
            }
        } while (choice != 1 && choice != 2);

        if (choice == 2) {
            Console.print("Ti incammini verso il corridoio buio...");
            Console.print("");
            Console.print("Avanzi sicuro e potretto dal tuo scudo!");
        } else {
            Console.print("Ti incammini verso il corridoio illuminato...");
            Console.print("");
            hearts--;
            Console.print("Inneschi una trappola a pressione e ti ritrovi infilzato da tante spine!");
            Console.print("Perdi un cuore! Cuori rimanenti: " + hearts);
            Console.print("");
            Console.print("Ritorni indietro e avanzi verso il corridoio buio");
            Console.print("Avanzi sicuro e potretto dal tuo scudo!");
        }
        return hearts;
    }

    //STEP 3: ARMERIA ABBANDONATA
    public static int stepThree(String warriorName, int hearts){
        Console.print(warriorName + "! Ora entri in un'antica armeria solcata da ragnatele.");
        Console.print("1) Ignorare tutto e andare verso l'uscita");
        Console.print("2) Aprire un baule di legno elfico con il tuo spadone");
        Console.print("3) Raccogliere una spada dall'elsa nera e brillante");
        Console.print("");
        int choice;
        do {
            IO.print("Scegli: ");
            choice = Console.readInt();
            if (choice != 1 && choice != 2 && choice != 3) {
                Console.print("Grandioso! Sei riuscito a sbagliare la scelta!");
                Console.print("Devi scegliere tra 1 e 3");
            }
        } while (choice != 1 && choice != 2 && choice != 3);

        switch (choice) {
            case 1:
                Console.print("Cominci a correre verso l'uscita...");
                Console.print("");
                Console.print("Troppo frettoloso! Calpesti un'asse malridotta e ti storci la caviglia.");
                Console.print("");
                hearts--;
                Console.print("Hai perso un cuore! Cuori Rimanenti: " + hearts);
                break;
            case 2:
                Console.print("Spezzi la serratura di un baule elfico con il tuo spadone...");
                Console.print("");
                Console.print("Trovi un elisir di guarigione! Il tuo spirito da combattente si rinvigorisce!");
                Console.print("");
                hearts++;
                Console.print("Hai guadagnato una vita! Adesso hai " + hearts + " vite rimanenti.");
                break;
            case 3:
                Console.print("Impugni la spada dall'aspetto maledetto...");
                Console.print("");
                Console.print("La spada ti scotta la mano prima che tu possa lasciarla cadere.");
                Console.print("");
                hearts--;
                Console.print("Hai perso un cuore! Cuori rimanenti: " + hearts);
                break;
        }
        return hearts;
    }

    public static int stepFour(String warriorName, int hearts){
        Console.print(warriorName + "! Ora ti trovi davanti all'ultimo passaggio prima della Stanza del Portale.");
        Console.print("");
        Console.print("Decidi di:");
        Console.print("1) Passare dal ponte sospeso sulla lava");
        Console.print("2) Camminare lungo il cornicione stretto ma solido");
        Console.print("");
        Console.print(warriorName + "! Per questa ultima scelta ti darò l'opportunità di tirare una moneta");
        Console.print("Sei davvero coraggioso da lanciarla? (si / no)");
        String r = Console.readString().toLowerCase();
        String result = "";
        int choice = 0;
        if(r.equals("si")){
            Console.print("Perfetto! Testa per il percorso 1 / Croce per il percorso 2...");
            result = FlipCoin.coinFlip();
            Console.print(warriorName + "! La moneta dice... " + result);
        }else {
            do {
                IO.print("Scegli: ");
                choice = Console.readInt();
                if (choice != 1 && choice != 2) {
                    Console.print("Fessacchiotto! Devi scegliere tra 1 e 2!");
                }
            } while (choice != 1 && choice != 2);
        }

        if (choice == 2 || result.equals("Croce")) {
            Console.print("Cammini lungo il cornicione stretto ma solido...");
            Console.print("");
            Console.print("Raggiungi il covo del boss senza graffi!");
        } else {
            Console.print("Passi dal ponte sospeso sulla lava...");
            Console.print("Il ponte cede parzialmente e ti scotti!");
            hearts--;
            Console.print("");
            Console.print("Perdi 1 cuore! Cuori rimanenti: " + hearts);
        }
        return hearts;
    }
}
