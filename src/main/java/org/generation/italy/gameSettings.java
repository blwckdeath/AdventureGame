package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class gameSettings {

    public static Scanner input = new Scanner(System.in);

    public static String pgName(){
        IO.println("L'avventura ha inizio!");
        IO.println("Innanzitutto: 1Come ti chiami? ");
        String pgName = input.nextLine();
        return pgName;
    }
    public static String fellowshipName(){
        IO.println("Fai parte della compagnia...?");
        String fellowshipName = input.nextLine();
        return fellowshipName;
    }


    public static int pgChoice(String pgName) {
        int pgClass = 1;
        do{
            IO.println("Qual è la tua classe: ");
            String[] pgPossClass = {"1. Mago", "2. Paladino", "3. Ladro", "4. Druido", "5. Guerriero"};
            for(int i = 0; i < pgPossClass.length; i++){
                IO.println(pgPossClass[i]);
            }

            pgClass = input.nextInt();
            switch(pgClass) {
                case 1:
                    IO.println();
                    IO.println(pgName + ", sei un MAGO!");
                    break;
                case 2:
                    IO.println();
                    IO.println(pgName + ", sei un PALADINO!");
                    break;
                case 3:
                    IO.println();
                    IO.println(pgName + ", sei un LADRO!");
                    break;
                case 4:
                    IO.println();
                    IO.println(pgName + ", sei un DRUIDO!");
                    break;
                case 5:
                    IO.println();
                    IO.println(pgName + ", sei un GUERRIERO!");
                    break;
                default:
                    IO.println("Scelta non valida");
            }
        }while(pgClass >= 5 || pgClass <= 1);
        return pgClass;

    }

    public static int diceThrown(){
        Random random = new Random();
        int attackLuck = random.nextInt(20) + 1;

        return attackLuck;
    }



}
