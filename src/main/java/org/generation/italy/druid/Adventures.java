package org.generation.italy.Druid;


public class Adventures {
    public static void game() {
        Picture.picture();

        IO.print("--------------------------------------------------");
        IO.print("   L'AVVENTURA DEL DRUIDO ");
        IO.print("--------------------------------------------------");
    }
public static int lifes = 3;

    public static void runSteps() {
        lifes = Steps.fightingTree(lifes);
        IO.println("Vite attuali: " + lifes);
    }
    public static void runSteps1() {
        lifes = Steps.crossingRiver(lifes);
        IO.println("Vite attuali: " + lifes);

    }
    public static void runSteps2() {
        lifes = Steps.riddle(lifes);
        IO.println("Vite attuali: " + lifes);
    }

    public static void runSteps3() {
        lifes = Steps.portal(lifes);
        IO.println("Vite attuali: " + lifes);

    }


}