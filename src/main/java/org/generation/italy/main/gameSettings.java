package org.generation.italy.main;

import org.generation.italy.druid.Picture;
import org.generation.italy.thief.Retard;
import org.generation.italy.thief.Sprite;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class gameSettings {

    public static Scanner input = new Scanner(System.in);

    public static String pgName(){
        IO.println("L'avventura ha inizio!");
        IO.println("Innanzitutto: 1Come ti chiami? ");
        String pgName = input.nextLine();
    return pgName;
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
                    Sprite.thiefSprite();
                    IO.println();
                    IO.println(pgName + ", sei un LADRO!");
                    break;
                case 4:
                    Picture.druidAscii();
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
        int wait = random.nextInt(5) + 1;
        IO.println("Un dado è stato lanciato, il suo valore deciderà la tua sorte...");

            try {
                TimeUnit.SECONDS.sleep(wait);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        IO.println("Alea Iacta Est: " + attackLuck);
        return attackLuck;
    }
    public static int pgAttack(int diceNum, int kalojeraw, int potions, int lives){
        IO.println("Cosa vuoi fare? 1. Curati; 2. Attacca;");
        int choice = input.nextInt();
        if(choice == 1){
            potions = potions--;
            lives = lives++;
            IO.println("Hai usato una pozione. Vite: " + lives + "; pozioni disponibili: " + potions);
        }
        if(diceNum == 20){
            kalojeraw = 0;
        } else if (diceNum < 20 && diceNum >= 10){
            kalojeraw--;
            IO.println("Il tuo attacco è andato a segno e lo stregone è stato ferito. altri " + kalojeraw + "colpi e cadrà!");
        }else if(diceNum < 10 && diceNum >= 5){
            IO.println("Il tuo colpo non ha ferito il crudele Kalojeraw, però nello schivare ha battuto la testa e ora è stordito. Approfitta di questo momento per attaccarlo di nuovo!");
            int secondDice = diceThrown();
            if(secondDice > 10){
                kalojeraw--;
                IO.println("La tua astuzia è stata ripagata, sei riucito a ferire Kalojeraw l'Oscuro!");
            } else {
                IO.println("Lo stregone si è ripreso prima che riuscissi a colpirlo e ti ha schivato ancora.");
            }
        }else{
            IO.println("Lo stregone primate ha intercettato il tuo attacco e lo ha schivato sapientemente.");
        }
        return kalojeraw;
    }
    public static int pgDefense(int diceNum, int lives){
        if(diceNum == 20){
            lives = 0;
        } else if (diceNum < 20 && diceNum >= 10){
            lives--;
            IO.println("Lo stregone è riuscito a ferirti. altri " + lives + "colpi e per te sarà la fine!");
        }else if(diceNum < 10 && diceNum >= 5){
            IO.println("Hai schivato l'attacco dello stregone, però nello schivare hai battuto la testa e ora sei stordito. Riprenditi prima che lo egli ti colpisca ancora!");
            int secondDice = diceThrown();
            if(secondDice > 10){
                lives--;
                IO.println("Troppo tardi! Il malefico Kalojeraw è riuscito a colpirti. Ti rimangono" + lives + "vite");
            } else {
                IO.println("Ti sei ripreso prima che riuscisse a colpirti e stavolta hai schivato con successo!");
            }
        }else{
            IO.println("La tua esperienza in lunghe campagne ti ha permesso di schivare sapientemente il sortilegio di Kalojeraw.");
        }
        return lives;
    }
    public static void kalojerawAscii() {
        String kalojerawAscii = "@@@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@%@*@@@@@@@@@%@@@@%@@%@@@@@@@@@@@@%@@@@@@@\n" +
                "@@@@@@@@@@@%@@@@#@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@@+..    *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@#@@@@@\n" +
                "@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@@@@@%@@@@@..%.  %%%%: .%..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%@@@@@@@@%@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@@@##                    #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@#@@@@@@@@@@@%@@@@%@@@@%=                          %%@@@@@*@@@@%@@@@@@@@@@@@@@@@@%@@@@#@@@@@@\n" +
                "@@#@@@%@@@@#@@%@%@@%@@@@%@@@@@@@@@@@@=%           .+#+=++%*.         +@@@%@@%@@@@@%@@@@@@@@@@@@@@@@#@@@#*@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@#@@@@@@.          :          :           @@@@@@@@@@%@@@@@@@@@@%@@@@@@@@@@@@@#@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=           .  #@    @#              @@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*          :#.*          #-#:          *%@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@%@@@@@%@@@@@@@@ -      .- .=                +.         . @@@@@@@@@@@@@@@@@#@%@*@@@@%@@@@@@@\n" +
                "@@@@@@@@%@@@@@%@%%@@@@@@@@@@@@@@*..       =                      +        .+@@@@@@@@@@@@@@@#@@@@@@@@@@@#@%@@@\n" +
                "@@@@@@@@@#@*@=@@@@@@@@@@@@@@@@@@ -            #:     .+*+   =#            * @@@@@@@@@@@@@@@@%@@@@@@@@@@@%@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@. @             -@@ :@@@@# *@+             @  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@%@@@@@@@@@%@   @        .@@@-*.@#.:%%=.%@...@@@-        @   @%@@@@@:@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@%@@@@*@@@@@@@@  :  .%      @@*%..*@@@@@#*.@@@@@@=  **%@      *.     @@@@@@@@@%@@@@@@@@%@@@@@%@@@\n" +
                "@@@%@@@@@@@@@@@@@@@@@@@@@@.-    * -    -          :==  ==           :    + @     :@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@%@@@@@@@@@@@@@     *                                          *-    %%@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@*@@@@@@@@@@@@@@@@.    .         %                     .  -         .     @@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@%@@%@@@+    .           .@       %@:.*:@:.      #.           -    #@@@@@@@@@@@@%@@%@@@@%@%@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@#+    +              *#= =--@@@@@@@@-%= .-+.                  -*@@@@@@@@%@@@*%@@%@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@=                      #= *+@%@#@*@%%= :#                      =@@@@@@@@@@@@@@@@@@@@@%@\n" +
                "@@@@@@@@@@@@@@@:   .:                       -  %%:@  -#  %*#@  =                       :    =@@@@@@@@@%@@@@@@\n" +
                "@@@%%@@@@@@@@@@#-                            @@%@@@@@+@@@@@@#@+                            .-.@@@@@#@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@#*                            %+@@@@@@@@@@@@@@@@%%                            #%@@@@@@@@@@@@@@%\n" +
                "@@%@@@%@@@@@@@*.                             #@@@@@@@@@@@@@@@:@.                            -*%@@@@@@@@@@@@@@\n" +
                "@@@%@@@@%@@+.+%*+-                            .%@%@#@#+@*@@@@%                            -@*++:-@@%@@#@%@@@@\n" +
                "@@@@@@@@@@%@@@@@:                             :::-=+*#%%%%%#=:.                            :@@@@@@@%@@@@@@@@@\n" +
                "@@@@@@@@@#@@%                                                                                  :@@@@%#@@@@@@@\n" +
                "@@@@@%@@@@@@                                                                                    *=@@@@@@@@@%@\n" +
                "*@@@@@@@@% @%++:                     -=+@@@-                    :@@@*==.      :              ++%@*%@@@@@@@%@@\n" +
                "@@@@@%@@            @*     =@@@@ *@#@#@@  :@##                ++@:  :@%+%@==%@@%+     =@            #@@@@@@@@\n" +
                "@@@@@@.#@...     @@%   %@@@@@@@@%        .*-+. %*          =%=.. *.        %%@@@@@@@%-  *@@:       @# @@@@@@@\n" +
                "@@+@@@@= #     @  #  =@@+  @@#%@@%%-          %+@@:      .@@=@          .@@@@%#@@@@@@@=. -  +     . .@@@@@@@@\n" +
                "@@@@@@=*      @  :  .@%@@@@#@:#*.%.++@:         +  =    =  :         :@@@-# #@ @@@@@@%@*  +  %=     :-@@@@@@@\n" +
                "%@@@@.       #      %-  :@++%@@@   :@%@@%==                      -=+%@%@:   *@@@@@@ : :-   :  @       .@@@@@@\n" +
                "@@@+         #  *   :#      .#%@@.   -    *  -+              --.-%-  .#    +*@+-      @:   *  =         *@@@@\n" +
                "@@@          .  -              #-:-@@%       .@@=          .@@:       #@@ =:@                            =@@@\n" +
                "@@@                        =@@@     ==*- @                        - :#@*     %@@@           -            %@@@\n" +
                "@@:            .             =*@%%            .#%          ##=            ##@*:             *            .@@@\n" +
                "@:             =                .  @@#                                *@@-                  *              @@\n" +
                "@*                                  .-   -@                      %*   -:                                  @+@\n" +
                "++ *                                                                                                    +  +@\n" +
                "+:=@..                                                                                                  %- @@\n" +
                "@:@@.#                                                                                                +.@@ @@\n" +
                "@+@@+@                                                                                                @.@@ @@\n" +
                "@@@%@%=                                                                                               @@@%@@@\n" +
                "%@@@@@@                                                                                              @@@%@@@@\n" +
                "@@@@@%@%                                                                                            %@@@@@@@@\n" +
                "@@@@@@@@@                   @@                                                %@                   #@@%@@@=@@\n" +
                "@%@@@@@@@@        -       .@@@@@                                            +@@@%-       :        @@@#@@@@@@@\n" +
                "@@@@@#@#@%@%       @@@%***@@@@@@.   %                                  %    @@@@@@**#%@@@       %@@@@@@@@%@@@\n" +
                "@@@@@@@@@@@@@@=  @. @@@@@@@@@@@@@  #%@                               .@%%- %@@@@@@@@@@@% :@   @@@@@@@@@@@@@@@\n" +
                "@@@@@@%@@@@@@@@@@ #@@#:@@@@@@@@@@@ *@+@-%                          *-@%@% @@@@@@@@@@@*#@@# #@@@@@@@@@@@@@@@@@\n" +
                "@@@@%@%@@%@@@@@@@@*@@@@@@%@%%@@@@@@#=@%@@@@:   @@@@@@%@@@@@@@.  .@#@@@#=*@@@@@@@@@@%@@@@@+@@@@@@@@@@@@@@@@@@@\n" +
                "#@#@@@@@@@@%@@@@@%@+@@@@@@@@@@@@@@@@@@%@@@@@@@*=+-+@@#@@@+:+*+@@@@@@@@@@@@@@@@@%@@@@@@@@+@@@@@@@@@@@%@@@@*@@@\n" +
                "@@@@@@%@@@@@#@@@@@@@@@@@%@@@@@@@@@@%@@@@@+@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@%@@#@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@%@@%@@@@@@@@@@@@@@@@%@@*%@@@@@@@@@@@*@@@@@@@@@@@@@@@@%@@@@@@@@@@@%@@@@@@@@@@@%@@@@@@@@@+@@@@@@@@@@@\n";
        String[] kalojerawAsciiArray = kalojerawAscii.split("\\n");
        for (int i = 0; i < kalojerawAsciiArray.length; i++) {
            IO.println(kalojerawAsciiArray[i]);
            Retard.retardSprite();
        }

    }

}
