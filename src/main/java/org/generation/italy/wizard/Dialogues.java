package org.generation.italy.wizard;

import java.util.concurrent.TimeUnit;

public class Dialogues {
    public static void introduction (String pgName) {

        IO.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        IO.println (pgName + ", conosciuto anche come il devasto delle lande, si sveglia al tavolo di una locanda." +
        "\nLa puzza di alcol con una leggera nota di vomito aleggia nella stanza." +
        "\nUn altro sorso oltre il mezzo boccale che ha già consumato di quella specie di intruglio che si trova davanti a lui potrebbe essere quasi fatale.");
        IO.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void challenge () {

        IO.println("\n\nTi rivolgi ai tuoi compagni. Con aria con aria spocchiosa:");
        retard();
        IO.println("\n<Signori, penso che andrò a fare un giro, la mia mente ha bisogno di prendere aria>");
        retard();
        IO.println("\nIl tuo compagno di squadra guerriero ti risponde:");
        retard();
        IO.println("\n<Eddai noiosone finisci il boccale... Se hai le palle>");
        retard();
        retard();
    }

    public static void firstChoice() {
        IO.println("\n\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        IO.println("Cosa vuoi fare? (Rispondi con il numero)");
        retard();
        IO.println("1.Esci\n2.Accetta la sfida");
        IO.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");



    }

    public static void library(String pgName) {
        IO.println("Decidi di andare in un posto più adatto a te, la biblioteca.\n");
        retard();
        IO.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        IO.println("Entri in edificio ben tenuto, ordinato e dal piacevole odore di pergamena.");
        retard();
        IO.println("Un ragazzo con sorriso malizioso da orecchio ad orecchio si rivolge a te.");
        retard();
        IO.println("\n<Signore vuole comprare qualche libro?>");
        retard();
        IO.println("\n<Che razza di biblioteca vende i libri? E comunque non compro niente, ma sai con chi hai a che fare!?>");
        retard();
        IO.print("\n<.");
        retard();
        IO.print(".");
        retard();
        IO.print(".");
        retard();
        IO.println("chi?>");
        retard();
        IO.println("\n<" + pgName +" il terrore delle lande! " + pgName +" il padrone degli elementi! "+ pgName + " il grande mago!>");
        retard();
        IO.println("\nGuardandoti con aria di sfida:");
        retard();
        IO.println("<Bene signor mago. Si dia il caso che conosco un indovinello proprio adatto a qualcuno come voi:\n");
        retard();
        IO.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        IO.println("Conosciuta da ognuno dei grandi arcanisti, a volte causa di lievi imprevisti." +
                "\nSi potrebbe dire sia un piccolo sole che non sta in cielo, di chi mi affronta non rimarrà neanche il pelo" +
                "\nSono l'incantesimo migliore, sbaraglio nemici di ogni taglia e colore." +
                "\nNon si scherza con me, non è un gioco, perché io sono la famosissima" +
                "----- -- -----");
        IO.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }

    public static void celebration () {
        IO.print ("\n<PALLA DI FUOCO! ");
        retard();
        IO.print ("PALLA DI FUOCO! ");
        retard();
        IO.println ("PALLA DI FUOCO! ");
        retard();
        IO.println("Il mio incantesimo preferito è palla di fuoco!>");
        retard();
        IO.println("\nSenza far più caso al bibliotecario esci dalla biglioteca tronfio della tua maestria e indiscussa abilità.\n" +
                "-Ti ricordi l'incantesimo palla di fuoco-");
        IO.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void delusion (){
       IO.println("\nSai di conoscere la risposta... C'è qualcosa che non va.. ");
       retard();
       IO.println("Con lo sguardo basso esci mestamente dalla biblioteca..");
       retard();
       IO.println("Senti che dietro di te il ragazzo dice qualcosa, ma tu non ci fai caso\n");
       IO.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void woman () {
        IO.println("Per strada una donna disperata dopo esserti corsa in contro ti prende i polsi e ti dice:");
        retard();
        IO.println("\n<Ti prego. C'è un portale nel bosco. Fai qualcosa.>");
        retard();
        IO.println("\nPrima che tu possa fargli qualsiasi domanda corre via." +
                "\nLe faresti volentieri qualche domanda ma non hai l'età per starle dietro," +
                "\ne poveretta, non sembra nello stato di ragionare.");
        retard();
        IO.println("\nDecidi di recarti verso il bosco.");
        IO.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void goblin () {
IO.println("\n\nPoco dopo l'ingresso nella selva senti degli sghignazzi goblineschi. Capisci quello che sta per succedere.." +
        "\n3 goblin si parano sulla tua strada con aria spavanda.");
retard();
IO.println("\n<Sei nel nostro territorio vecchio e nessuno ti ha invitato" +
"\nMa visto che noi siamo buoni dacci tutti i tuoi soldi e ti lasciamo andare>");
retard();
IO.println("\nLa sola cosa che odi di più che avanzino pretese su di te è che lo facciano sui tuoi soldi!!!" +
        "\n(E in più non ne hai con te in questo momento)" +
        "\n\nDecidi quindi di affrontarli\n");
    }

    public static void incenerated () {
        retard();
        retard();
        IO.println("Per loro ENORME sfortuna proprio poco fa ti sei ricordato il tuo incantesimo preferito");
        retard();
        retard();
        IO.println("\nIl tuo braccio si distende verso di loro inesorabilmente.");
        retard();
        retard();
        IO.println("Sul palmo della tua mano si materializza una sfera di fiamme vorticanti");
        retard();
        retard();
        IO.println("La palla di fuoco schizza sui nemici schiantandosi in un gigantesco BOOOM!");
        retard();
        retard();
        IO.println("Ti prendi un momento per ammirare la tua opera" +
                "Incredibilmente un la pozione di cura che uno di quei goblin trasportava si è salvata");
        retard();
        IO.println("-Ottieni 1 punto salute-");
    }

    public static void end () {
        retard();
        IO.println("\n()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()");
        IO.println("Terminato lo scontro scorgi poco più in là il portale di cui parlava la donna");
        retard();
        IO.println("E' un grande volta di blocchi di pietra contenente un velo oltre cui c'è un fumo viola vorticante");
        retard();
        IO.println("Decidi di atraversarlo");
        IO.println("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()");

    }


    public static void retard () {
         try {
             TimeUnit.SECONDS.sleep(1);
             } catch (InterruptedException e) {
                throw new RuntimeException(e);
             }
        }
    }

