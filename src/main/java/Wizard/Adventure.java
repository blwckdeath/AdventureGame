package Wizard;
import java.util.Scanner;
import java.util.Random;

public class Adventure {
    public static void main() {

        Scanner scanner = new Scanner(System.in);


        Dialogues.introduction();

        Dialogues.challenge();
        Dialogues.firstChoice();
        int answer;
        do {

            answer = scanner.nextInt();

            if (answer == 2) {

                IO.println("Ti siedi di nuovo. Afferri il boccale è trangugi il suo contenuto:");
                int roll = DiceResults.Dice();
                DiceResults.firstRoll(roll);

                break;
            }else if (answer==1) {
                IO.println("Decidi di uscire");
                break;
            }else {
                IO.println("Risposta non valida");

            }
        } while (answer != 1 || answer != 2);
    }

}


// Locanda
//

//esci
//accetta la sfida, continui a bere
//
//Decidi di andare in un posto più adatto a te, la biblioteca.
//
//Entri in edificio ben tenuto, ordinato e dal piacevole odore di pergamena.
//Un ragazzo con sorriso malizioso da orecchio ad orecchio si rivolge a te.
//
//<Signore vuole comprare qualche libro?>
//
//<Che razza di biblioteca vende i libri? E comunque non compro niente, ma sai con chi hai a che fare?>
//
//<...chi?>
//
//<Nome.pg il terrore delle lande, Nome.pg il padrone degli elementi, Nome.pg il grande mago>
//
//Guardandoti con aria di sfida:
//<Bene signor mago. Si dia il caso che conosco un indovinello proprio adatto a qualcuno come voi:
//
//
//Conosciuta dai grandi arcanisti, a volte causa di lievi imprevisti.
//Si potrebbe dire sia un piccolo sole che non sta in cielo, di chi mi affronta non rimarrà neanche il pelo
//Sono l'incantesimo migliore, sbaraglio nemici di ogni taglia e colore.
//Non si scherza con me, non è un gioco, perché io sono la famosissima ----- -- -----