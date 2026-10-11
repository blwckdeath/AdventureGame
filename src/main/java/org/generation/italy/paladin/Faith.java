package org.generation.italy.paladin;
//Capacità del paladino di avere fede in quello che fa, ha successo percentuale, il successo sarà
public class Faith {
    //condizione vero\falso di successo
    public static void beliveInYourFate () {
      double randomNumber =Math.random();
      if(randomNumber < 0.5) {
          IO.println("Abbondi di fede, la Dea ti ama e ti dà la sua grazia");

      }else {
          IO.println("La tua fede non basta, la Dea è delusa");

      }
    }
}
