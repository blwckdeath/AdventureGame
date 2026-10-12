package org.generation.italy.druid;


public class Adventures {


    public static int druid(String pgName, int lifes) {

        IO.print("--------------------------------------------------");
        IO.print("   L'AVVENTURA DEL DRUIDO " + pgName.toUpperCase());
        IO.print("--------------------------------------------------");
        lifes = Steps.fightingTree(lifes);
        IO.println("Vite attuali: " + lifes);
        lifes = Steps.crossingRiver(lifes);
        IO.println("Vite attuali: " + lifes);
        lifes = Steps.riddle(lifes);
        IO.println("Vite attuali: " + lifes);
        lifes = Steps.portal(lifes);
        IO.println("Vite attuali: " + lifes);


        return lifes;
    }



}