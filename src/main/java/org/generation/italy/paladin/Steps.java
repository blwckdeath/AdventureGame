package org.generation.italy.paladin;

import java.util.Scanner;

public class Steps {
    public static Scanner input = new Scanner(System.in);
    public static void paladinJourney(int lives) {
        IO.println("Congratulazioni! Sei il Paladino, che la fede sia con te!");
        IO.println("Sei catapultato nella chiesa di OH, dove tutti sono abbastanza sorpresi. ");
        IO.println("All'esterno della chiesa si aprono tre strade quale scegli?");
        IO.println("1. Le catacombe dei ricordi annebbiati");
        IO.println("2. Il Pantheon Immacolato");
        IO.println("3. La Casa di un'anziana signora");

        IO.println("Inserisci il numero della tua scelta: ");

        int choice = input.nextInt();
        if (choice == 1) {
            Steps.catacombRoute(lives);
        } else if (choice == 2) {
            Steps.pantheonRoute(lives);
        } else if (choice == 3) {
            Steps.grannyRoute(lives);
        }
    }

    public static int catacombRoute ( int lives){
        IO.println("--- LE CATACOMBE DEI RICORDI ANNEBBIATI ---");
        IO.println("Scendi i gradini umidi. L'aria si fa pesante e senti dei cupi sussurri nell'oscurità.");
        IO.println("Mentre avanzi, una fitta nebbia ti avvolge e davanti a te noti due cose:");
        IO.println("1. Un altare antico che emana una debole luce azzurra.");
        IO.println("2. Uno scrigno di pietra sigillato da catene arrugginite.");

        IO.println("Cosa decidi di fare, Paladino? Inserisci il numero: ");
        int catacombChoice = input.nextInt();

        if (catacombChoice == 1) {
            IO.println("Ti avvicini all'altare. La luce azzurra risuona con la tua fede!");
            IO.println("Senti una calda energia scorrere nelle tue vene: i tuoi dubbi svaniscono.");
            IO.println("Ottieni la 'Benedizione dei Ricordi'. La strada davanti a te ora è chiara.");
        } else if (catacombChoice == 2) {
            IO.println("Ti avvicini allo scrigno e spezzi le catene con la tua forza.");
            IO.println("Purtroppo era una trappola! Un'ombra oscura si sprigiona dal baule.");
            IO.println("L'oscurità ti avvolge e perdi le forze. Sei costretto a ritirarti ferito.");
            lives--;

        }
        return lives;
    }

        public static int altareRoute ( int lives){
        IO.println("Grazie alla luce dell'altare, la nebbia si dirada rivelando una maestosa porta di ferro.");
        IO.println("Al centro della porta c'è un'incisione: 'Solo chi ha il cuore colmo di fede può passare'.");
        IO.println("Un guardiano di pietra a guardia della porta si desta e ti interroga:");
        IO.println("'Paladino, qual è il tuo scopo in questo luogo sacro?'");
        IO.println("1. 'Cerco il potere per distruggere i miei nemici.'");
        IO.println("2. 'Voglio proteggere i deboli e riportare la luce.'");

        IO.println("Scegli le parole del Paladino: ");
        int doorChoice = input.nextInt();

        if (doorChoice == 1) {
            IO.println("Il guardiano di pietra scuote la testa: 'La sete di potere ti acceca'.");
            IO.println("La porta rimane sigillata e le statue ti respingono con un'onda d'urto!");
            lives--;
        } else if (doorChoice == 2) {
            IO.println("Il guardiano sorride e i suoi occhi di pietra si illuminano.");
            IO.println("'La tua fede è pura, Paladino'. I grandi ingranaggi di ferro iniziano a muoversi.");
            IO.println("La porta si spalanca...");
        }
        return lives;
    }

        public static int pantheonRoute ( int lives){
        IO.println("--- IL PANTHEON IMMACOLATO ---");
        IO.println("Le enormi porte d'oro si aprono su una navata immensa, fatta di marmo bianco splendente.");
        IO.println("Grandi statue di antichi eroi ti osservano dall'alto. L'atmosfera è solenne.");
        IO.println("Al centro della sala, un'entità fatta di pura luce blocca il passaggio verso l'altare maggiore.");
        IO.println("La creatura parla con una voce che sembra un coro: ");
        IO.println("'Fermati, Paladino. Solo chi possiede l'intelletto oltre alla fede può calpestare questo suolo.'");
        IO.println("'Rispondi al mio quesito, o verrai respinto per sempre.'");

        IO.println("Ecco l'indovinello:");
        IO.println("Più ne togli, più diventa grande. Che cos'è?");
        IO.println("1. L'ombra");
        IO.println("2. Un buco");
        IO.println("3. Il silenzio");

        IO.println("Inserisci il numero della tua risposta: ");
        int pantheonChoice = input.nextInt();

        if (pantheonChoice == 2) {
            IO.println("L'entità di luce risplende ancora più forte e accenna un inchino.");
            IO.println("'La tua mente è acuta, Paladino. Il segreto del vuoto ti è noto.'");
            IO.println("La creatura si dissolve in mille scintille dorate, lasciando cadere a terra");
            IO.println("un potente cimelio: lo 'Scudo dell'Alba'.");
            IO.println("Una luce accecante ti avvolge e vieni teletrasportato in avanti...");

        } else if (pantheonChoice == 1 || pantheonChoice == 3) {
            IO.println("L'entità scuote il capo tristemente: 'Risposta errata. L'oscurità avvolge la tua mente'.");
            IO.println("Un lampo accecante ti colpisce e ti ritrovi catapultato fuori dal Pantheon, stordito.");
            lives--;
        }
        return lives;
    }

        public static int grannyRoute ( int lives){
        IO.println("--- LA CASA DELLA VECCHIA ---");
        IO.println("Bussi alla porta di legno. Una vecchietta dal sorriso dolce ti accoglie calorosamente.");
        IO.println("L'aria è intrisa del profumo delizioso di una crostata appena sfornata.");
        IO.println("'Oh, un giovane Paladino! Entra, entra pure, devi essere esausto dopo i tuoi viaggi!'");
        IO.println("Ti fa accomodare a tavola e ti offre una fetta di dolce e una tazza di tè fumante.");
        IO.println("Tuttavia, aguzzando la vista da Paladino, noti qualcosa di strano:");
        IO.println("Sotto la credenza spuntano dei piccoli boccetti con etichette di pozioni dai nomi bizzarri,");
        IO.println("e nell'angolo della stanza noti un enorme specchio antico, coperto da un velo nero polveroso.");

        IO.println("Cosa decidi di fare? Inserisci il numero della tua scelta: ");
        IO.println("1. Accetti l'ospitalità, mangi la crostata e bevi il tè senza fare domande.");
        IO.println("2. Rifiuti gentilmente il cibo, insospettito, e le chiedi spiegazioni su quei boccetti.");
        IO.println("3. Ti avvicini allo specchio coperto dal velo e decidi di scoprirlo.");

        int grannyChoice = input.nextInt();

        if (grannyChoice == 1) {
            IO.println("Mangi con appetito. Dopo pochi morsi, le tue palpebre diventano pesantissime...");
            IO.println("Ti risvegli ore dopo in un fosso fuori dal villaggio, senza un soldo e senza armi.");
            IO.println("La simpatica vecchietta era in realtà un'astuta strega truffatrice!");
            lives--;

        } else if (grannyChoice == 2) {
            IO.println("Chiedi spiegazioni con fermezza ma educazione. L'anziana signora scoppia a ridere!");
            IO.println("'Ah, che vista acuta! Sono l'alchimista in pensione del villaggio. Volevo solo testarti!'");
            IO.println("Apprezzando la tua prudenza, la vecchietta ti regala una 'Pozione del Vigore Alchemico'.");
            IO.println("Ti mostra una botola sul pavimento: 'Questa ti porterà dove devi andare'...");

        } else if (grannyChoice == 3) {
            IO.println("Togli il velo nero. La superficie dello specchio non riflette la stanza, ma un vortice viola!");
            IO.println("Prima che tu possa fare un passo indietro, una forza magnetica ti spinge in avanti.");
            IO.println("Attraversi il vetro come se fosse acqua... Ti trovi in un Mondo al Contrario!");

        }
        return lives;
    }

        public static int reverseWorldRoute ( int lives){
        IO.println("--- Il MONDO AL CONTRARIO ---");
        IO.println("Tutto qui è capovolto: il cielo è viola, l'erba è blu e la gravità sembra leggerissima.");
        IO.println("Davanti a te compare una figura bizzarra: un demone dall'aspetto spaventoso, ma indossa");
        IO.println("una tunica da sacerdote e stringe un rosario. Ti parla con voce gentile e affettuosa:");
        IO.println("'Benvenuto, nobile Paladino. In questo regno, i mostri cercano la pace e gli umani portano il caos.'");
        IO.println("'Un gruppo di cavalieri malvagi sta attaccando il nostro villaggio di goblin pacifici. Ci aiuterai?'");

        IO.println("Cosa fa la tua fede in questo mondo invertito? Inserisci il numero: ");
        IO.println("1. 'I mostri sono mostri! Vi sconfiggerò tutti in nome della giustizia!'");
        IO.println("2. 'La vera giustizia difende chi è debole, a prescindere dal suo aspetto.'");

        int reverseChoice = input.nextInt();

        if (reverseChoice == 1) {
            IO.println("Sguaini la spada e attacchi. Ma in questo mondo i tuoi poteri di luce feriscono i buoni!");
            IO.println("La tua stessa arma si ritorce contro di te, punendo la tua ottusità.");
            IO.println("Vieni respinto indietro attraverso lo specchio e ti ritrovi a terra a pancia in giù.");
            lives--;

        } else if (reverseChoice == 2) {
            IO.println("Il demone sorride e ti benedice: 'Il tuo cuore vede oltre le apparenze'.");
            IO.println("Insieme a lui respingi i cavalieri corrotti. Per ringraziarti, il villaggio");
            IO.println("ti dona la 'Spada dell'Eclissi'. Ti riaccompagnano allo specchio per tornare a casa.");
            IO.println("Rientri nella casa dell'anziana, ma una forza arcana ti trascina oltre...");
        }
        return lives;
    }
        public static int finalRoom ( int lives){
        IO.println("=======================================================");
        IO.println("--- IL SANTUARIO DEL DESTINO ---");
        IO.println("Indipendentemente dal cammino percorso, i tuoi passi ti hanno condotto qui.");
        IO.println("Ti trovi in una stanza immensa, illuminata da pilastri di fuoco sacro.");
        IO.println("Al centro della stanza fluttua il 'Calice dell'Eternità', l'obiettivo del tuo viaggio.");
        IO.println("Tuttavia, un'enorme armatura vuota e animata da spiriti si frappone tra te e il traguardo.");
        IO.println("È il guardiano del Calice! Ti sfida a duello.");
        IO.println("=======================================================");

        IO.println("Premi 1 per sguainare la spada e colpire il guardiano: ");
        int finalChoice = input.nextInt();
        if (finalChoice == 1) {
            IO.println("IL MONDO SI SGRETOLA");
            IO.println("Il pavimento sotto i tuoi piedi si spacca in mille pezzi");
            IO.println("Proprio mentre stai per precipitare nel nulla sotto di te si apre uno squarcio di energia e cadi dentro un portale senza poterti opporre");
        }
        return lives;
    }







}

