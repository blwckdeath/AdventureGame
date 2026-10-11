package Wizard;

import java.util.concurrent.TimeUnit;

public class Dialogues {
    public static void introduction () {
        //MANCA NOME. spazzi?
        IO.println("\n\n\n");
        IO.println ("conosciuto anche come il devasto delle lande si sveglia nella locanda." +
        "\nPer quanto incantatore temibile la sua costituzione è segnata dagli anni." +
        "\nLa puzza di alcol con una leggera nota di vomito aleggia nella stanza." +
        "\nUn altro sorso oltre il mezzo boccale che ha già consumato di quella specie di intruglio che si trova davanti a lui potrebbe essere quasi fatale.");

    }

    public static void challenge () {

        IO.println( "Ti rivolgi ai tuoi compagni. Con aria con aria spocchiosa.");
        retard();
        IO.println("\n<Signori, penso che andrò a fare un giro, la mia mente ha bisogno di prendere aria>");
        retard();
        IO.println("\nIl tuo compagno di squadra guerriero ti dice:");
        retard();
        IO.println("\n<Eddai noiosone finisci il boccale... Se hai le palle>");
        retard();
        retard();
    }

    public static void firstChoice() {
        IO.println("\n\nCosa vuoi fare? (Rispondi con il numero)");
        retard();
        IO.println("1.Esci\n2.Accetta la sfida");


    }

    public static void library() {
        IO.println("Decidi di andare in un posto più adatto a te, la biblioteca.");
        retard();
       IO.println("\nEntri in edificio ben tenuto, ordinato e dal piacevole odore di pergamena.");
        retard();
       IO.println("Un ragazzo con sorriso malizioso da orecchio ad orecchio si rivolge a te.");
        retard();
        IO.println("<Signore vuole comprare qualche libro?>");
        retard();
        IO.println("<Che razza di biblioteca vende i libri? E comunque non compro niente, ma sai con chi hai a che fare!?>");
        retard();
        IO.println(".")
        retard();
        IO
                ..chi?>\n" +
                "//\n" +
                "//<Nome.pg il terrore delle lande, Nome.pg il padrone degli elementi, Nome.pg il grande mago>\n" +
                "//\n" +
                "//Guardandoti con aria di sfida:\n" +
                "//<Bene signor mago. Si dia il caso che conosco un indovinello proprio adatto a qualcuno come voi:\n" +
                "//\n" +
                "//\n" +
                "//Conosciuta dai grandi arcanisti, a volte causa di lievi imprevisti.\n" +
                "//Si potrebbe dire sia un piccolo sole che non sta in cielo, di chi mi affronta non rimarrà neanche il pelo\n" +
                "//Sono l'incantesimo migliore, sbaraglio nemici di ogni taglia e colore.\n" +
                "//Non si scherza con me, non è un gioco, perché io sono la famosissima ----- -- -----");

    }





    public static void retard () {
         try {
             TimeUnit.SECONDS.sleep(1);
             } catch (InterruptedException e) {
                throw new RuntimeException(e);
             }
        }
    }

