package org.generation.italy.thief;


public class Adventure {
   public static int thief(String pgName, int lifes){
       IO.print("--------------------------------------------------");
       IO.print("   L'AVVENTURA DEL LADRO " + pgName.toUpperCase());
       IO.print("--------------------------------------------------");
       lifes = Steps.thiefPath(pgName, lifes);
       lifes = Steps.thiefPath2(pgName, lifes);
       lifes = Steps.thiefPath3(pgName, lifes);
       IO.println("Vite attuali: " + lifes);

       return lifes;
   }

}

