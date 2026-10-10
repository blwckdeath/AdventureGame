package org.generation.italy.warrior;

import java.util.Random;

public class FlipCoin {
    public static String coinFlip(){
        Random random = new Random();
        int launch = random.nextInt(2);
        if(launch == 0){
            return "Testa";
        }else{
            return "Croce";
        }
    }
}
