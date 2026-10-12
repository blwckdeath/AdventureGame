package org.generation.italy.Druid;
import java.util.Scanner;

public class Steps {
    public static int fightingTree(int lifes) { //step 1
        Scanner choiceStep1 = new Scanner(System.in);

        IO.println("Lo stregone ti ha intrappolato in un bosco da incubo, una foresta distorta dalla sua magia oscura.");
        IO.println("Senti che il legame con la natura qui è debole,");
        IO.println("ma è l'unica arma che hai per sopravvivere e raggiungere il portale alla fine del sentiero.");
        IO.println("Parti con 3 Punti Vita.");
        IO.println("\n--- L'ANTICO ALBERO ---");
        IO.println("Un gigantesco albero millenario ti sbarra la via.");
        IO.println("I suoi rami pulsano di magia malata e si muovono come serpenti.");

        IO.println("\nCome agisci?");
        IO.println("1 - Canta un'antica melodia curativa");
        IO.println("2 - Usa un'ascia per tagliare i rami");
        IO.println("3 - Striscia a fatica tra i rovi spinosi");
        IO.print("Digita 1, 2 o 3 e premi Invio: ");

        int optionSteps1 = choiceStep1.nextInt();


        if (optionSteps1 == 1) {
            IO.println("Hai scelto di cantare. L'albero si calma, la corruzione svanisce e passi in sicurezza. (Vite perse: 0)");

        } else if (optionSteps1 == 2) {
            IO.println("Hai scelto di attaccare! L'albero si difende violentemente e ti colpisce con un ramo. (Vite perse: 1)");
            lifes--;

        } else if (optionSteps1 == 3) {
            IO.println("Hai scelto di strisciare. Ne esci pieno di graffi ma eviti il pericolo maggiore. (Vite perse: 0)");

        } else {
            IO.println("Scelta non valida! Preso dalla confusione inciampi in una radice maledetta e ti fai male. (Vite perse: 1)");
            lifes--;
        }
return lifes;

    }
    public static int crossingRiver(int lifes) { //step 2
        Scanner choiceStep2 = new Scanner(System.in);

        IO.println("\n--- IL FIUME ---");
        IO.println("Arrivi sulle sponde di un fiume, ma l'acqua non è limpida, ma ti sembra torbida e potenzialmente pericolosa");
        IO.println("Devi arrivare dall'altra parte");
        IO.println("\nCome agisci?");
        IO.println("1 - Pianti un seme magico sulla riva");
        IO.println("2 - Attraversi a nuoto il fiume");
        IO.print("Digita 1 o 2 e premi Invio: ");

        int option = choiceStep2.nextInt();

        if (option == 1) {
            IO.println("Hai scelto di piantare un seme! Crescono radici magiche. Attraversi in sicurezza il fiume. (Vite perse: 0)");

        } else if (option == 2) {
            IO.println("Hai scelto di attraversare il fiume a nuoto! L'acqua è velenosa. Ti indebolisce gravemente. (Vite perse: 1)");
            lifes--;

        } else {
            IO.println("Scelta non valida! Mentre stai decidendo cosa fare da dietro ti carica un rinoceronte.");
            IO.println("Arrivi direttamente sull'altra sponda ma il rinoceronte ti ha ferito. (Vite perse: 1)");
            lifes--;
        }
    return lifes;

    }

    public static int riddle(int lifes) {
        Scanner inputStage3 = new Scanner(System.in);

        IO.println("\n --- IL GUARDIANO E L'INDOVINELLO ---");
        IO.println("Ti trovi in una radura. Davanti a te si materializza lo spirito guardiano della foresta.");
        IO.println("Il guardiano ti dice \"Complimenti per essere giunto fin qui avventuriero\"");
        IO.println("Prima di farti proseguire dovrò sottoporti ad un indovinello per capire se sei un druido degno. Hai 3 tentativi: ");
        IO.println("Radici invisibili ha,");
        IO.println("più in alto degli alberi sta,");
        IO.println("lassù tra le nuvole va");
        IO.println("e mai tuttavia crescerà.");

        boolean solvedRiddle = false;

        for(int i = 0; i < 3; i++) {
            IO.println("Sei pronto per darmi la risposta corretta?");
            String solution = inputStage3.nextLine();

            if(solution.equalsIgnoreCase("Montagna")) {
                IO.println("Hai risolto l'indovinello! Ti sei dimostrato degno!");
                solvedRiddle = true;
                break;

            } else {
                IO.println("Non hai indovinato, ritenta!");
            }
        }
        if(solvedRiddle == true) {
            IO.println("Il Guardiano ti dice \"Per la prossima scelta ricordati che l'apparenza inganna.\"");

        } else {
            IO.println("Non ti sei dimostrato degno, prosegui per la tua strada e rifletti sulle tue azioni");
        }

        IO.println("Subito dopo lo spirito scompare");
        IO.println("Appaiono davanti a te due sentieri: ");
        IO.println("Un passaggio buio, spinoso e dall'aspetto pericoloso, ma che profuma di terra umida e vera natura.");
        IO.println("Una strada lastricata, luminosa e invitante.");
        IO.println("Cosa decidi di fare: ");
        IO.println("1 - Attraversi il Sentiero dei Rovi");
        IO.println("2 - Attraversi il Sentiero Dorato");
        IO.print("Digita 1 o 2 e premi Invio: ");

        Scanner coicheStep4 = new Scanner(System.in);

        int option = coicheStep4.nextInt();

        if(option == 1) {
            IO.println("Hai scelto il Sentiero dei Rovi. Passandoci, i rovi si scostano delicatamente per te.");
            IO.println("Inoltre, toccandoti ti danno una sensazione di sollievo. (Vite recuperate: 1)");
            lifes++;

        } else if(option == 2) {
            IO.println("Hai scelto il Sentiero Dorato. In realtà è un'illusione dello stregone: ");
            IO.println("cadi in una trappola magica e vieni ferito da dardi di pura energia oscura.");
            lifes--;

            if(lifes == 0) {
                IO.println("Sei morto, GAME OVER");
            }

        } else {
            IO.println("Scelta non valida! Mentre decidi cosa fare, una freccia scoccata da molto lontano ti colpisce. Vite perse: 1");
            lifes--;

            if(lifes == 0) {
                IO.println("Sei morto, GAME OVER");
            }
        }
        return lifes;

    }

    public static int portal(int lifes) {
        Scanner input = new Scanner(System.in);
        IO.println("\n--- IL PORTALE ---");
        IO.println("Dopo che arrivi alla fine del percorso ti trovi davanti ad un portale, ma una barriera di rovi ne blocca il passaggio");
        IO.println("Come affonti l'ostacolo?: ");
        IO.println("1 - Usi un incantesimo di comunione con la terra per liberare il passaggio");
        IO.println("2 - Cerchi di sfondare la barriera con la forza bruta");
        IO.print("Digita 1 o 2 e premi Invio: ");

        int option = input.nextInt();

        if(option == 1) {
            IO.println("La barriera riconosce la tua purezza e si dissolve. Passi indenne! (Vite perse: 0)");

        } else if(option == 2) {
            IO.println("L'energia oscura ti corrode. Attraversi il portale ma la barriera ti ha ferito . (Vite perse: 1)");
            lifes--;

            if(lifes == 0) {
                IO.println("Le ferite erano troppe. Sei morto, GAME OVER");
            }

        } else {
                IO.println("Scelta non valida! Mentre stai pensando il portale ti risucchia. Attraversi il portale ma ti ferisci. (Vite perse: 1)");
                lifes--;

                if(lifes == 0) {
                    IO.println("Le ferite erano troppe. Sei morto, GAME OVER");
            }
        }
        return lifes;
    }
}
