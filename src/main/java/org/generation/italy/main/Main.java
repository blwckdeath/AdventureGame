package org.generation.italy.main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int lives = 3;
        int answer = Menu.menu();
        if(answer ==2){
            IO.println("Gioco Terminato.");
        } else {
            String pgName = gameSettings.pgName();
            int pgChoice = gameSettings.pgChoice(pgName);
            Lore.startGame();
            lives = Lore.midGame(pgName, pgChoice, lives);
            Lore.endGame(lives);

            }
    }
}
