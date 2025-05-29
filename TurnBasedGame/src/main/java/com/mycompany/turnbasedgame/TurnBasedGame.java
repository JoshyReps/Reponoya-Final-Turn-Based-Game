package com.mycompany.turnbasedgame;

import java.util.Random;
import java.util.Scanner;

public class TurnBasedGame {

    public static Random random = new Random();
    public static Scanner s = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        // ------------------------------------  HP    Name   Max Min  Passive Ability
        Hero player = new Hero(100, "Player", 10, 1, 100);
        // ----------------------------------------------------------------------------
        
        // ------- This creates a New Instnace of the Game Class which Holds the `Ecounter`, `Travel`, etc... --------
        Game game = new Game();
        // -----------------------------------------------------------------------------------------------------------
        
        // ------- This Method Call Starts the Game --------
        game.startGame(player);
        // -------------------------------------------------
    }
    // ============================================================================================================
    // ------------------------------------------------------------------------------------------------------------
}