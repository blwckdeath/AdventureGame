package org.generation.italy.warrior;
import com.generation.library.Console;

public class WAdventure {
    public static int warrior(String warriorName,int hearts) {
        Console.print("--------------------------------------------------");
        Console.print("   L'AVVENTURA DEL GUERRIERO " + warriorName.toUpperCase());
        Console.print("--------------------------------------------------");
        Console.print(Picture.picture);
        Console.print("Sei " + warriorName + ", un guerriero armato di spadone e armatura in piastre.");

        //Step 1: 3 scelte
        Console.print("---  L'INGRESSO DELLE ROVINE ---");
        hearts = Steps.stepOne(warriorName, hearts);

        // STEP 2 (Custode & Indovinello)
        Console.print("--- LO STREGONE E I CORRIDOI ---");
        hearts = Steps.stepTwo(warriorName, hearts);

        //Step 3: Cuore Bonus
        Console.print("--- L'ARMERIA ABBANDONATA ---");
        hearts = Steps.stepThree(warriorName, hearts);

        //controllo se ci sono abbastanza vite per proseguire
        if (hearts == 0) {
            return 0;
        }

        // STEP 4 (Ultima scelta prima del boss)
        Console.print("--- IL CORRIDOIO DEL PORTALE ---");
        hearts = Steps.stepFour(warriorName, hearts);

        return hearts;
    }



}
