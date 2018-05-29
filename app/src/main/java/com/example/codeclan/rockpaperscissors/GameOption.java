package com.example.codeclan.rockpaperscissors;

public enum GameOption {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private final String name;
        GameOption(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
    }




